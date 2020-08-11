package javapracticeday05;

import java.util.Scanner;

public class Ant01 {

	public static void main(String[] args) {
		//kullanýcýdan bölünen ve bölen þeklinde 2 sayý alalým ve bölme operatörünü 
		//kullanmadan bölme iþlemini gerçekleþtirelim.bölüm yazdýralým.
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bölünecek sayýyý giriniz");
		double bolunen = input.nextDouble();
        System.out.println("Lütfrn bölen sayýyý giriniz");
        double bolen = input.nextDouble();
        double bolum = 0;
        
        while(bolunen>=bolen) {
        	bolunen-=bolen;
        	bolum++;
        	
        }
System.out.println("bolum = " + bolum);
	}

}
