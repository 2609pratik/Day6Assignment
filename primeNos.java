package Day6;

import java.util.Scanner;

public class primeNos {
// *****************************************************prime or not
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a no to find prime or not : ");
//		int num = scanner.nextInt();
//		boolean isprime=false;
//		for (int i = 2; i <=num/2; i++) {
//			if(num%i==0) {
//				isprime=true;
//			}
//		}
//		if(isprime==true) {
//			System.out.println("no is not prime");
//		}
//		else {
//			System.out.println("no is prime");
//		}
//	}
	//*************************************************** printing reverse of a no
//	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a number : ");
//		int num = scanner.nextInt();
//		int reverse=0;
//		while (num>0) {
//			int rem=num%10;
//			reverse=reverse*10+rem;
//			num=num/10;
//		}
//		System.out.println(reverse);
//	}
// **************************************************************coupon
	public static void main(String[] args) {
		int i=0;
		int[] arr = new int[11];
		while(i<=10) {
			int coupon = (int) (Math.random()*10);
			//i++;
			//System.out.println(coupon);
			for (int j=0;j<i;j++) {
				if (coupon==arr[i]) {
					break;
				}
				else {
					arr[i]=coupon;
					i++;
				}
			}
			
		}
		System.out.println(i);
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
			//int i = arr[j];
			
		}
	}
}
