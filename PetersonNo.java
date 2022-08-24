package Day6;

public class PetersonNo {
	public static void main(String[] args) {
		int a = 145;
		int i=a;
		int fact = 0;
		while(i>0) {
			int temp = i%10;
			fact = fact + factorial(temp);
			i=i/10;
		}
		if (fact==a) {
			System.out.println("peterson no");
		}
		else {
			System.out.println("not peterson");
		}
		//System.out.println(fact);
	}

	public static int factorial(int temp) {
		int fact = 1;
		for (int j = 1; j <= temp; j++) {
			fact=fact*j;
		}
		return fact ;
	}
}
