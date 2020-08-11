package javapractiseday02;

import java.util.Scanner;

public class Ant05 {

	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Adýnýzý  giriniz");
		char adilk = scan.next().charAt(0);
		System.out.println("lütfen soyadýnýzý giriniz");
		char soyadilk = scan.next().charAt(0);
		System.out.println("adýnýzýn ilk harfi: "+ adilk +"\n" + "soyadýnýzýn ilk harfi: "+soyadilk);
		scan.close();
		

	}

}

