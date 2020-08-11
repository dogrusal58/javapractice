package javapracticeday01;

import java.util.Scanner;

public class practice061 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Birinci Sayý");
		int sayi1 = scan.nextInt();
		System.out.println("Ýkinci Sayý");
		int sayi2 = scan.nextInt();
	    int toplam = sayi1 + sayi2;
	    System.out.println("toplam" +" "+ toplam);
		
		scan.close();
				
		

	}

}
