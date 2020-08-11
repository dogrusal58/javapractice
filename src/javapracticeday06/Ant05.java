 package javapracticeday06;

public class Ant05 {

	public static void main(String[] args) {
		// Uc sayi arasindaki en buyuk sayiyi bulan java methodu yazalim.
		
		enBuyuk(6, 5, 8);
}
	public static void enBuyuk(double a, double b, double c) {
		
		if(a>b && a>c) {
			System.out.println("En buyuk sayi : " + a);
		}else if (b>a && b>c) {
			System.out.println("En buyuk sayi " + b);
		}else {
			System.out.println("En buyuk sayi: " + c);
		}
	}
}