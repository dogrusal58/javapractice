package javapractiseday02;

import java.util.Scanner;

public class Ant08 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("L�tfen bir harf giriniz");
        char ch =scan.next().charAt(0);
        String result = ch>='a'&& ch<='z' ? "k���k harf" : ch>='A' && ch<='Z' ? "b�y�k harf" :"hatal� giri� yapt�n�z";
        System.out.println(result);
        scan.next();
	}

}
