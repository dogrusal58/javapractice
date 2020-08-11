package javapractiseday02;

import java.util.Scanner;

public class Ant031 {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen 5 basamaklý sayý giriniz");
		
		int num = scan.nextInt(); //12345 
		
		int ilkIki  = num/1000; //12
		
		int sonIki = num%100; //45
		
		int iklIkiTop = (ilkIki%10)+ (ilkIki/10);
		
		int sonIkiTop = (sonIki %10) + (sonIki/10);
		
		
		System.out.println("Sayýlarýn toplamý: " +(iklIkiTop + sonIkiTop));
		scan.close();
		
	}
}
