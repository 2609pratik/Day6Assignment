package Day6;

public class IdentiyMatrix {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0][0]=1;
		arr[0][1]=0;
		arr[0][2]=0;
		arr[1][0]=0;
		arr[1][1]=1;
		arr[1][2]=0;
		arr[2][0]=0;
		arr[2][1]=0;
		arr[2][2]=1;
		boolean isidentity = false;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i==j) {
					if (arr[i][j]!=1) {
						isidentity = true;
						break;
					}
				}
				else {
					if (arr[i][j]!=0) {
						isidentity=true;
						break;
					}
				}
			}
				
		} 
		if (isidentity) {
			System.out.println("not a identity matrix");
		}
		else {
			System.out.println("identity matrix");
		}
			
	}
}


