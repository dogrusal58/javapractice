package javapractiseday02;

import java.util.Scanner;

public class Ant061 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen ya��n�z� giriniz: ");
		int yas = scan.nextInt();
		System.out.println("l�tfen kilonuzu giriniz: ");
		int kilo = scan.nextInt();
		String result =  (yas<18 ||kilo<50) ? "kan veremez" : "kan verebilir";
		System.out.println(result);
		scan.close();

	}

}
