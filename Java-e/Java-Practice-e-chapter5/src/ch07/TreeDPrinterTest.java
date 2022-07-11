package ch07;
 
public class TreeDPrinterTest {

	public static void main(String[] args) {

		// 예전 방식
		Powder powder = new Powder();
		TreeDPrinter3 printer = new TreeDPrinter3(); //TreeDPrinter3가 Object 타입이면
		printer.setMaterial(powder); // error 없지만
		Powder p = (Powder) printer.getMaterial(); // 형변환을 해야만하는 번거로움
	}

}
