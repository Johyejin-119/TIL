package ch07;
 
public class GenericPrinterTest {

/*  Generic은 번거롭게 Object 타입으로 형변환 하지 않아도 된다.
 * 	
	GenericPrinter<Powder>
	 
	컴파일될 때 GenericPrinter.java 파일의 <T>가 
	Powder로 변경된다
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
		
		/* 예전 방식
		
		Powder powder = new Powder();
		GenericPrinter powderPrinter = new GenericPrinter<>(); //<Powder>없이 Object타입으로 지정
		powderPrinter.setMaterial(powder);
		
		Powder p = (Powder)powderPrinter.getMaterial(); // 형 변환 해줘야함
		System.out.println(powderPrinter.toString());
		
		*/
		

	}

}
