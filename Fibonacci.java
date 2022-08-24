package Day6;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of terms  ");
		int n = scanner.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<n-2;i++) {
			int fibo;
			fibo = a+b;
			System.out.print(fibo+" ");
			a=b;
			b=fibo;
		}
	}
}
