package javapracticeday01;

import java.util.Scanner;

public class practice06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
System.out.println("bir say� giriniz :");
int sayi1 =scan.nextInt();
System.out.println("ikinci say�y� giriniz : ");
int sayi2 =scan.nextInt();
System.out.println(sayi1 + sayi2);//int toplam = sayi1 + sayi2; bunu yazmadan �al��t�rd�m.yaz�labilir.

scan.close();
	}

}

