package ch03;

public class AddTest {

	public static void main(String[] args) {

		// ���ٽ� : (x, y) -> {return x+y;}
		
		Add addL = (x, y) -> {return x+y;};
		Add addL2 = (x, y) ->  x-y; // ���๮ �ϳ��̰�, return ���� ��� {�߰�ȣ} ���� ����
		
		System.out.println(addL.add(2, 3));
		System.out.println(addL2.add(2, 3));
	}

}
