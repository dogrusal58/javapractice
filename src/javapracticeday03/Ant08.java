package javapracticeday03;

import java.util.Scanner;

public class Ant08 {

	public static void main(String[] args) {
		// Kullan�c�da 2 say� alaml�m
				//Kullan�c�dan 4 islemden birini secsin 
				//sonucu yazd�ral�m
				
				Scanner input = new Scanner (System.in);
				System.out.println("Lutfen 1. sayiyi giriniz");
				double num1 = input.nextDouble();
				System.out.println("Lutfen 2. sayiyi giriniz");
				double num2 = input.nextDouble();
				System.out.println("Lutfen isleminizi seciniz: \n1-toplama\n2-cikartma\n3-bolme\n4-carpma");
				String islem = input.next();
				switch (islem) {
				case "1":
					System.out.println("Toplama isleminin sonucu: " + (num1+num2));
					break;
					
				case "2":
					System.out.println("Cikartma isleminin sonucu: " + (num1-num2));
					break;
				case "3":
					System.out.println("Bolme isleminin sonucu: " + (num1/num2));
					break;
				case "4":
					System.out.println("Carpma isleminin sonucu: " +(num1*num2));
					break;
					default:
						System.out.println("Hatal� islem sectiniz");
				}
				input.close();
	}
}