package ch17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person2 implements java.io.Externalizable{ // ����ȭ ���� �����ϴ� �������̽�
	String name;
	transient String job; // ����ȭ ����
	
	public Person2() {}
	
	public Person2(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}

	// ����ȭ ���� ����

	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
		name = obj.readUTF();
		job = obj.readUTF();

	}
	
	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {
		obj.writeUTF(name);
		obj.writeUTF(job);

	}
}



public class Externalizable {

	public static void main(String[] args) {

		Person2 personLee = new Person2("�̼���", "��ǥ�̻�");
		Person2 personKim = new Person2("������", "���̻�");

		try( FileOutputStream fos = new FileOutputStream("serial2.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try( FileInputStream fos = new FileInputStream("serial2.txt");
				ObjectInputStream ois = new ObjectInputStream(fos)) {
			
			Person2 pLee = (Person2)ois.readObject();
			Person2 pKim = (Person2)ois.readObject();
			System.out.println(pLee);
			System.out.println(pKim);
			
		}catch(IOException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	
	}

}
