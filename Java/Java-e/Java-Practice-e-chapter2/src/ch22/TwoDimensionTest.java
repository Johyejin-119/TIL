package ch22;

public class TwoDimensionTest {

	public static void main(String[] args) {

		// 3�� 4����, 2���� �迭�� ���� �� ��������?
		// int[][] arr = new int[3][4];
		int[][] arr = {{1,2,3}, {1,2,3,4}};
		int i,j;
		for (i=0; i<arr.length; i++) { // length�� 0~2 �� 3
			for (j=0; j<arr[i].length; j++) { // length�� 0~3 �� 4
				System.out.print(arr[i][j] + ","); // �� ���� �� �ٿ� �̾ ����ϰ�
			}
			System.out.println("\t" + arr[i].length); // �� �ϳ��� ������, i��°�� length�� ���� ��� // \t�� ��Ű
		
		}
	}

}
