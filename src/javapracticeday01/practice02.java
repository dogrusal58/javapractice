package javapracticeday01;

import java.util.Scanner;

public class practice02 {
	/*
	 * kullan�c�dan veri almak
	 * ald���m�z veriyi ekrana yazd�ral�m
	 */

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    boolean booleanDegiskeni = scan.nextBoolean();
	    byte byteDegiskeni = scan.nextByte();
	    int intDegiskeni = scan.nextInt();
	    char charDegiskeni = scan.next().charAt(0);
	    short shortDegiskeni = scan.nextShort();
	    long longDegiskeni = scan.nextLong();
	    float floatDegiskeni = scan.nextFloat();
	    double doubleDegiskeni = scan.nextDouble();
	    String isim = scan.nextLine();
	    /*�u an yazd�rmad���m�z i�in soldaki �nlemler ��k�yor
	    birde yazd�rmak i�in sona System.out.prinln() yazmam�z laz�m
	    */
	    scan.close();
		

	}

}
