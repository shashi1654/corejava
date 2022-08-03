package Myproject2;

import java.util.Scanner;

public class EvenNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("enter the number: ");
		int num = Scanner.nextInt();
		int num1 = 32;
		System.out.println(num%2);
		if (num%2==0) {
			System.out.println("even no");
		}else {
			System.out.println("odd no");
		}

	}

}
