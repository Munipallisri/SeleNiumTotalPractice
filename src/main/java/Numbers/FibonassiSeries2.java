package Numbers;

import java.util.Scanner;

public class FibonassiSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,a=0,b=0,c=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value")
		num=sc.nextInt();
		
		for(int i=0;i<=num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a + "");
		}
		}
}