package Day6;

public class SparseMatrix {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0][0]=0;
		arr[0][1]=0;
		arr[0][2]=0;
		arr[1][0]=0;
		arr[1][1]=0;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9; 
		int countZero=0;
		int countNonZero=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j]==0) {
					countZero++;
				}
				else {
					countNonZero++;
				}
			}			
		}
		if (countZero>countNonZero) {
			System.out.println("matrix is sparse");	
		}
		else {
			System.out.println("matrix not sparce");
		}
	}

}
