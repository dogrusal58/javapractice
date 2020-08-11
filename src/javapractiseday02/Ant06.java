package javapractiseday02;

import java.util.Scanner;

public class Ant06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen yaþýnýzý giriniz: ");
		int yas = scan.nextInt();
		System.out.println("lütfen kilonuzu giriniz: ");
		int kilo = scan.nextInt();
		
		if(yas<18 || kilo<50) { System.out.println("kan baðýþý yapamaz");
		
		}else {System.out.println("kan baðýþý yapabilir");
		
		}
		scan.close();
	}

}
