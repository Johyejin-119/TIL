package ch09;

// ���� ó�� try-catch �� �α� ���
public class ArrayIndexException {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()); // Exception�� �޽�����
			System.out.println(e.toString()); // Exception�� Ǯ���� + �޽���
		
		}
		// �α� ���  =>  for���� ������ ������ ����� �ش� �α� ��� �ȵ�
		System.out.println("here!!!");
	}

}
