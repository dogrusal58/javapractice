package javapracticeday03;

import java.util.Scanner;

public class Ant06 {

	public static void main(String[] args) {
		// Kullanicidan boy CM  ve kilosunu alalim
        //BMI (VKE) hesaplayalým
        //BMI <=20 oldukca zayifsiniz
        //20<BMI<=25 Normal sinirlardasiniz 
        //25<BMI<=30 Sisman kategorisindesiniz
        //30<BMI ==> Obez grubundasiniz.
        //BMI = kilo /(boy*boy)
		Scanner scan=new Scanner (System.in);
		System.out.println(" Enter your weight and height");
		
		int w=scan.nextInt();
		double h=scan.nextDouble();
		double bmi=(double) w/(h*h);
		System.out.println(bmi);
		if (bmi<=20) {
			System.out.println("Zayif");
		}
		else if (bmi>20&& bmi<=25) {
			System.out.println("Normal");
		}
		else if (bmi>25&& bmi<=30) {
			System.out.println("Sisman");
		}
		else if (bmi>30 ){
			System.out.println("obez");


	}
		scan.close();

}
}
