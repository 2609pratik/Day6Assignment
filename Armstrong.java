package Day6;

import java.util.Scanner;

public class Armstrong {
	public static int armstrong=0;
	public static void perfectNo(int a) {
		int temp = a;
		for (int i = 1; i <= a; i++) {
			//int armstrong=0;
			for (int j = 1; j <= i ; j++) {
				if(i%j==0) {
					armstrong+=j;
					System.out.println(armstrong);
				}
			}
			if(armstrong==temp) {
				System.out.println(armstrong + " is a perfect no");
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range untill user want armstrong no : ");
		int a = scanner.nextInt();
		perfectNo(a);
		
	}
}
