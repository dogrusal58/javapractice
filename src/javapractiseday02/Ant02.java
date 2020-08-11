package javapractiseday02;

import java.util.Scanner;

public class Ant02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("iki tam sayý giriniz");
		Double s1 = scan.nextDouble();
		Double s2 = scan.nextDouble();
	    System.out.println(s1+s2);
		System.out.println(s1-s2);
		System.out.println(s1*s2);
		System.out.println(s1/s2);
		scan.close();
	}

}
