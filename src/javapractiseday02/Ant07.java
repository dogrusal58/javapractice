package javapractiseday02;

import java.util.Scanner;

public class Ant07 {

	public static void main(String[] args) {
		// Kullan�cdan al�nan say�n�n negatif , pozitif yada notr olma durumunu konrtol eden ternary yazal�m
		
				Scanner sc = new Scanner(System.in);
				
				System.out.println("L�tfen bir say� giriniz");
				
				int num = sc.nextInt();
				
				String result = num<0 ? "Negatif":num>0 ? "Pozifit": "notr";
				
				System.out.println(result);
				sc.close();
	}
}
//if num<0 ,else if num>0, else notr
