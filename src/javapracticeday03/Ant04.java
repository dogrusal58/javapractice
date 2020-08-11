package javapracticeday03;

import java.util.Scanner;

public class Ant04 {

	public static void main(String[] args) {
		// kullanýcýdan 3 tane pozitif tam sayý alalým
		//bu üç sayýnýn üçgen oluþturup oluþturmadýðýný kontrol edelim
		//eðer üçgen ise ve a=b=c ise eþkenar üçgen
		//eðer saðlamýyorsa sadece üçgen
		//üçgen deðil(üçgen eþitsizliðini saðlamýyorsa)
		
		Scanner input = new Scanner(System.in);
		System.out.println("birinci kenar");
		float a =input.nextFloat();
		System.out.println("ikinci kenar");
		float b =input.nextFloat();
		System.out.println("üçüncü kenar");
		float c = input.nextFloat();
		 if(a+b>c && a-b<c && b+c>a && b-c<a && a+c>b && a-c<b) { if(a==b & b==c) {System.out.println("eþkenar üçgen");
		 
		 }else {System.out.println("üçgen fakat eþkenar deðil");
		 
		 }
		 }else {System.out.println("üçgen deðildir");
		 
		 }
input.close();
	}

}
