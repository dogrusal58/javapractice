package javapracticeday03;

import java.util.Scanner;

public class Ant04 {

	public static void main(String[] args) {
		// kullan�c�dan 3 tane pozitif tam say� alal�m
		//bu �� say�n�n ��gen olu�turup olu�turmad���n� kontrol edelim
		//e�er ��gen ise ve a=b=c ise e�kenar ��gen
		//e�er sa�lam�yorsa sadece ��gen
		//��gen de�il(��gen e�itsizli�ini sa�lam�yorsa)
		
		Scanner input = new Scanner(System.in);
		System.out.println("birinci kenar");
		float a =input.nextFloat();
		System.out.println("ikinci kenar");
		float b =input.nextFloat();
		System.out.println("���nc� kenar");
		float c = input.nextFloat();
		 if(a+b>c && a-b<c && b+c>a && b-c<a && a+c>b && a-c<b) { if(a==b & b==c) {System.out.println("e�kenar ��gen");
		 
		 }else {System.out.println("��gen fakat e�kenar de�il");
		 
		 }
		 }else {System.out.println("��gen de�ildir");
		 
		 }
input.close();
	}

}
