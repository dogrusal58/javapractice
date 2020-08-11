package javapracticeday09;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Bir sayı lütfen");
		 int num= sc.nextInt();
		 if (ugly(num)==false) {
		 System.out.println("ugly number degildir");}
		 else {
			 System.out.println("ugly number");
		 }
		 
		 sc.close();
	}
	
	public static boolean ugly(int num) {
		if (num==0) {
			return false;}
		if (num==1) {
			return true;}
		if (num%2==0) {
			num=num/2;
			return ugly(num);}
		if (num%3==0) {
			num=num/3;
			return ugly(num);}
		if (num%5==0) {
			num=num/5;
			return ugly(num);}
		else {
			return false; }
	}
		

}
