package javapractiseday02;

import java.util.Scanner;

public class Ant03 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("5 basamaklý bir sayý giriniz");
		long s = scan.nextLong();
		long r1 = s % 10;
		System.out.println(r1);
		long r2 = (s/10)%10;
		System.out.println(r2);
		long r3 = (s/100)%10;
		System.out.println(r3);
		long r4 =(s/1000)%10;
		System.out.println(r4);
		long r5 =(s/10000)%10;
		System.out.println(r5);
		long a = r1+r2;
		long b = r4+r5;
		System.out.println(a+b);		
		scan.close();
		

	}

}
