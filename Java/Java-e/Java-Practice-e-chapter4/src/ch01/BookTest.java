package ch01;

// Object Ŭ���� toString() ���
class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
	
	
}


public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("���̾�", "�츣�� �켼");
		System.out.println(book);  //  ���� toString() ���ٶ��̵� �޼ҵ� ���� ���, ch01.Book@436e852b ��� => @����޸𸮰� 16����
		System.out.println(book);  //  ���̾�, �츣�� �켼  =>  �̹� toString()���� �������̵�(������)�Ǿ�����
		System.out.println(book.toString());  //  ���̾�, �츣�� �켼 
		
		
		String str = new String("test");
		System.out.println(str); // test ���  =>  �̹� toString()���� �������̵�(������)�Ǿ�����
		System.out.println(str.toString()); // test ���
	}

}
