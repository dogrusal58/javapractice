package javapracticeday05;

import java.util.Scanner;

public class Ant01 {

	public static void main(String[] args) {
		//kullan�c�dan b�l�nen ve b�len �eklinde 2 say� alal�m ve b�lme operat�r�n� 
		//kullanmadan b�lme i�lemini ger�ekle�tirelim.b�l�m yazd�ral�m.
		Scanner input = new Scanner(System.in);
		System.out.println("L�tfen b�l�necek say�y� giriniz");
		double bolunen = input.nextDouble();
        System.out.println("L�tfrn b�len say�y� giriniz");
        double bolen = input.nextDouble();
        double bolum = 0;
        
        while(bolunen>=bolen) {
        	bolunen-=bolen;
        	bolum++;
        	
        }
System.out.println("bolum = " + bolum);
	}

}
