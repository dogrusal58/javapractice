package javapracticeday01;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ýsim ve Soyisim Yazýnýz : ");
		String isimSoyisim = scan.nextLine();
		
		System.out.println("Boyunuzu yazýnýz : ");
		int boy = scan.nextInt();
		
		System.out.println("Kilonuzu yazýnýz : ");
		float kilo = scan.nextFloat();
		
		System.out.println("Hobilerinizi Giriniz : ");
		scan.nextLine();//iki defa nextline string kaynaklý olabilir.nextline ile ilgili bir hata alýrsak bir nextline koyarýz öncesine
		String hobi = scan.nextLine();
		
		System.out.println(isimSoyisim);
		System.out.println(boy);
		System.out.println(kilo);
		System.out.println(hobi);
		
		scan.close();
		
	
	}

}
