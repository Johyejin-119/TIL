package ch07;
 
public class TreeDPrinterTest {

	public static void main(String[] args) {

		// ���� ���
		Powder powder = new Powder();
		TreeDPrinter3 printer = new TreeDPrinter3(); //TreeDPrinter3�� Object Ÿ���̸�
		printer.setMaterial(powder); // error ������
		Powder p = (Powder) printer.getMaterial(); // ����ȯ�� �ؾ߸��ϴ� ���ŷο�
	}

}
