package Day6;

public class OddEvenCountermatrix {
	public static void main(String[] args) {
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
		int evenCounter = 0;
		int oddcounter = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j]%2==0) {
					evenCounter++;
				}
				else {
					oddcounter++;
				}
			}
		}
		System.out.println("even no in array "+ evenCounter);
		System.out.println("odd no in array " + oddcounter);
	}

}
