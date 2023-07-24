package ch23;

import java.util.ArrayList;

class FastLibrary {
	public ArrayList<String> shelf = new ArrayList();
	
	public FastLibrary() {
		shelf.add("�¹���1");
		shelf.add("�¹���2");
		shelf.add("�¹���3");

	}
	
	// å ��������
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		while( shelf.size() == 0 ) { // resource�� ���� �� ��ٸ��� �ϱ� => �ش� �޼ҵ� ����ϸ� not runnable ���·�
			System.out.println(t.getName() + " waiting start");
			wait();
			System.out.println(t.getName() + " waiting end");
		}
		
		if( shelf.size() > 0) {
			String book = shelf.remove(0); // �� �տ� �ִ� å ��������
			System.out.println(t.getName() + " : " +  book + " lend");
			return book;
		}
		else return null;
		
	}
	
	// å �ݳ�
	public synchronized void returnBook(String book) {
		Thread t = Thread.currentThread();

		shelf.add(book);
		notifyAll(); // wait()���� �����
		System.out.println(t.getName() + " : " +  book + " return");
	}
}

class Student extends Thread {
	public Student(String name) {
		super(name);
	}

	public void run() {
		
		try {
			String title = LibraryMain.library.lendBook(); // å ����
			if( title == null ) {
				System.out.println(getName() + " ������ ���߽��ϴ�.");
				return;
			}
			sleep(5000);
			LibraryMain.library.returnBook(title); // å �ݳ�
			
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}


public class LibraryMain {

	public static FastLibrary library = new FastLibrary();
	public static void main(String[] args) {

		Student std1 = new Student("std1");
		Student std2 = new Student("std2");
		Student std3 = new Student("std3");
		Student std4 = new Student("std4");
		Student std5 = new Student("std5");
		Student std6 = new Student("std6");
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
	}

}