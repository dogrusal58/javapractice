package javapractiseday02;

import java.util.Scanner;

public class Ant08 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir harf giriniz");
        char ch =scan.next().charAt(0);
        String result = ch>='a'&& ch<='z' ? "küçük harf" : ch>='A' && ch<='Z' ? "büyük harf" :"hatalý giriþ yaptýnýz";
        System.out.println(result);
        scan.next();
	}

}
