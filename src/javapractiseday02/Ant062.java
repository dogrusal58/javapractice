package javapractiseday02;

import java.util.Scanner;

public class Ant062 {

	public static void main(String[] args) {
		// Kullan�c�dan  ya��n� ve kilosunu alal�m
		// 18 ya��ndan k���k ise kan ba���� yapamaz
		// 18 ya��ndan b�y�k ve 50 kilo dan hafif ise kan ba���� yapamaz.
		// 18 ya��ndan b�y�k ve 50 kilodan a��r ise kan ba���� yapabilir.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("L�ften ya��n�z� giriniz");
		 int yas = sc.nextInt();
		 System.out.println("L�tfen kilonuzu giriniz");
		 int kilo = sc.nextInt();
//		 
//		 if (yas>18) {
//			 		 
//			 System.out.println("L�tfen kilonuzu giriniz");
//			 int kilo = sc.nextInt();
//			 if (kilo>50) {
//			 System.out.println("Kan verebilirsiniz.");
//			 }else {
//			 System.out.println("50 kilodan hafifler kan ba���� yapamaz.");
//		 }
//	 }else {
//			 System.out.println("18 ya��ndan k���kler kan ba���� yapamaz.");
//		 }
	
//		 
		 String result = yas>18 ? kilo>50 ? "Kan ba���� yapabilir":"50 kilodan hafifler kan ba���� yapamaz."
			 :"18 ya��ndan k���kler kan ba���� yapamaz."; 
		 System.out.println(result);
	

		
	sc.close();
}
}



