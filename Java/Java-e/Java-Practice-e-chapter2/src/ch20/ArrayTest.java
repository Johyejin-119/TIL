package ch20;

public class ArrayTest {

	public static void main(String[] args) {

		// ù��° for�� �Ⱦ���, �̷��� �ٷ� ���൵ �� 
		// int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int[] arr = new int[10]; // newŰ���带 ���ԵǸ�, ������ o �Ǽ��� 0.0 ��ü�� null�� �ʱ�ȭ��
		int total = 0;
		
		for(int i = 0, num = 1; i <arr.length; i++) {
			arr[i] = num++; // 1,2,3...�ְ� �� �߰�
		}
		
		// ó������ ������ �� ��ȸ�� �� �̳ٽ��� for
		for(int num : arr) {
			total += num;
		}
		
		System.out.println(total);
	}

}
