package javapracticeday01;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�sim ve Soyisim Yaz�n�z : ");
		String isimSoyisim = scan.nextLine();
		
		System.out.println("Boyunuzu yaz�n�z : ");
		int boy = scan.nextInt();
		
		System.out.println("Kilonuzu yaz�n�z : ");
		float kilo = scan.nextFloat();
		
		System.out.println("Hobilerinizi Giriniz : ");
		scan.nextLine();//iki defa nextline string kaynakl� olabilir.nextline ile ilgili bir hata al�rsak bir nextline koyar�z �ncesine
		String hobi = scan.nextLine();
		
		System.out.println(isimSoyisim);
		System.out.println(boy);
		System.out.println(kilo);
		System.out.println(hobi);
		
		scan.close();
		
	
	}

}
