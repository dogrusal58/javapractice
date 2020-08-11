package javapractiseday02;

import java.util.Scanner;

public class Ant051 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("adýnýzý ve soyadýnýzý giriniz");
		String adsoyad = scan.nextLine();
		System.out.println("isminizin ilk harfi: " + adsoyad.charAt(0) + "\n" + "soyisminizin ilk harfi: " + adsoyad.charAt(6));
		scan.close();
		

	}

}
//bu sadece ismi 5 harf olanlar için geçerli,çünki soyiminin ilk harfi 6. harf oluyor.
