package Day6;

public class TranposeMatrix {public static void main(String[] args) {
	int[][] arr = new int[3][3];
	arr[0][0]=1;
	arr[0][1]=2;
	arr[0][2]=3;
	arr[1][0]=4;
	arr[1][1]=5;
	arr[1][2]=6;
	arr[2][0]=7;
	arr[2][1]=8;
	arr[2][2]=9;
	int [][] arr1 = new int[3][3];
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			arr1[j][i]=arr[i][j];
		}
	}
	System.out.println("after transpose");
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.print(arr1[i][j]+" ");
		}
		System.out.println("");
	}
}

}
