package ch07;
 
public class GenericPrinterTest {

/*  Generic�� ���ŷӰ� Object Ÿ������ ����ȯ ���� �ʾƵ� �ȴ�.
 * 	
	GenericPrinter<Powder>
	 
	�����ϵ� �� GenericPrinter.java ������ <T>�� 
	Powder�� ����ȴ�
*/
	public static void main(String[] args) {

		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial();
		System.out.println(powderPrinter.toString());
		
		Plastic plastic = new Plastic();
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(plastic);
		
		Plastic pl = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter.toString());
		
		/* ���� ���
		
		Powder powder = new Powder();
		GenericPrinter powderPrinter = new GenericPrinter<>(); //<Powder>���� ObjectŸ������ ����
		powderPrinter.setMaterial(powder);
		
		Powder p = (Powder)powderPrinter.getMaterial(); // �� ��ȯ �������
		System.out.println(powderPrinter.toString());
		
		*/
		

	}

}
