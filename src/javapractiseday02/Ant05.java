package javapractiseday02;

import java.util.Scanner;

public class Ant05 {

	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen Ad�n�z�  giriniz");
		char adilk = scan.next().charAt(0);
		System.out.println("l�tfen soyad�n�z� giriniz");
		char soyadilk = scan.next().charAt(0);
		System.out.println("ad�n�z�n ilk harfi: "+ adilk +"\n" + "soyad�n�z�n ilk harfi: "+soyadilk);
		scan.close();
		

	}

}

