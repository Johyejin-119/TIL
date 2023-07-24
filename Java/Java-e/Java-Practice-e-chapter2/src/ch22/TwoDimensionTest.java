package ch22;

public class TwoDimensionTest {

	public static void main(String[] args) {

		// 3행 4열로, 2차원 배열에 값을 안 넣으려면?
		// int[][] arr = new int[3][4];
		int[][] arr = {{1,2,3}, {1,2,3,4}};
		int i,j;
		for (i=0; i<arr.length; i++) { // length는 0~2 총 3
			for (j=0; j<arr[i].length; j++) { // length는 0~3 총 4
				System.out.print(arr[i][j] + ","); // 한 행은 한 줄에 이어서 출력하고
			}
			System.out.println("\t" + arr[i].length); // 행 하나가 끝나면, i번째의 length가 얼만지 출력 // \t는 탭키
		
		}
	}

}
