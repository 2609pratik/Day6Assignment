package Day6;

public class SumRowColoum {
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
		int r0=0;
		int c0=0;
		int r1=0;
		int c1=0;
		int r2=0;
		int c2=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				switch(i) {
				case 0:
					r0+=arr[0][j];
					break;
				case 1:
					r1+=arr[1][j];
					break;
				case 2:
					r2+=arr[2][j];
					break;
				}
				switch(j) {
				case 0:
					c0+=arr[i][0];
					break;
				case 1:
					c1+=arr[i][1];
					break;
				case 2:
					c2+=arr[i][2];
					break;
				}
			}
		}
		System.out.println("r0 r1 r2 c0 c1 c2");
		System.out.println( r0+"  "+r1+"  "+r2+"  "+c0+"  "+c1+"  "+c2);
	}
}
