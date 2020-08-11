package javapracticeday01;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
System.out.println("Birinci sayý :");
int sayi1 = scan.nextInt();
System.out.println("ikinci sayý :");
float sayi2 = scan.nextFloat();
float toplam = sayi1 + sayi2;
System.out.println("Toplam" + " " + toplam);

scan.close();
	}

}
