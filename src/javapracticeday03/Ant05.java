package javapracticeday03;

import java.util.Scanner;

public class Ant05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("birinci kenar");
		float a =input.nextFloat();
		System.out.println("ikinci kenar");
		float b =input.nextFloat();
		System.out.println("���nc� kenar");
		float c = input.nextFloat();
		String result = (a+b>c && a-b<c && b+c>a && b-c<a && a+c>b && a-c<b)? (a==b && b==c)? "e�kenar ��gen" : "��gen fakat e�kenar de�il" :"��gen de�il";
		System.out.println(result);
		input.close();//bir �nceki soruyu ternary ile ��zd�k

	}

}
