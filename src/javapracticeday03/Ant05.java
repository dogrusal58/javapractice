package javapracticeday03;

import java.util.Scanner;

public class Ant05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("birinci kenar");
		float a =input.nextFloat();
		System.out.println("ikinci kenar");
		float b =input.nextFloat();
		System.out.println("üçüncü kenar");
		float c = input.nextFloat();
		String result = (a+b>c && a-b<c && b+c>a && b-c<a && a+c>b && a-c<b)? (a==b && b==c)? "eþkenar üçgen" : "üçgen fakat eþkenar deðil" :"üçgen deðil";
		System.out.println(result);
		input.close();//bir önceki soruyu ternary ile çözdük

	}

}
