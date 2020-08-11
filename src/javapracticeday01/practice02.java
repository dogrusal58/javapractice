package javapracticeday01;

import java.util.Scanner;

public class practice02 {
	/*
	 * kullanýcýdan veri almak
	 * aldýðýmýz veriyi ekrana yazdýralým
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
	    /*þu an yazdýrmadýðýmýz için soldaki ünlemler çýkýyor
	    birde yazdýrmak için sona System.out.prinln() yazmamýz lazým
	    */
	    scan.close();
		

	}

}
