package ch18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandumAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100); // 4byte
		System.out.println("pos: " + rf.getFilePointer()); 
		
		rf.writeDouble(3.14); // 8byte
		System.out.println("pos: " + rf.getFilePointer()); // 4+8=12
		
		rf.writeUTF("�ȳ��ϼ���"); // (�ѱ� ���� �ϳ��� 3byte) 3 * 5 = 15byte + null �� 2bytle = 17bytle
		System.out.println("pos: " + rf.getFilePointer()); // 12+17=29
		
		// position ����  =>  filepointer�� ��𼭺��� ������ ����
		rf.seek(0); // ó������
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);

	}

}
