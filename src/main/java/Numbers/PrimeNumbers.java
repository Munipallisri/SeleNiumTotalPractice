package Numbers;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		j = sc.nextInt();

		for (i = 1; i <= j; i++) {
			if (j % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Given number is prime");
		} else {
			System.out.println("Not a Prime Number");

		}

	}
}
