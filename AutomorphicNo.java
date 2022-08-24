package Day6;

public class AutomorphicNo {
	public static void main(String[] args) {
		int a = 76;
		int b = a*a;
		int counter = 1;
		int i = a;
		while (i%10>0) {
			i=i/10;
			counter=counter*10;
		}
		int c = b-a;
		if (c%counter==0) {
			System.out.println("no is automorphic");
		}
		else {
			System.out.println("not a automorphic");
		}
	
	}

}
