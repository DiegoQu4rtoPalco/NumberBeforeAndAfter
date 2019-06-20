/*
 * Um programa para dizer um numero antes e depois de uma variavel inteira
 * A program for saying a number before and after an integer variable.
 */

import java.util.Scanner;

public class NumberBeforeAfter {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		
		if (n == n) {
			n++;
			System.out.println("Number rigth: " + n);
		}
		
		n--;
		
		if (n == n) {
			n--;
			System.out.println("Number left: " + n);
		}
		
		
		sc.close();

	}

}
