package javapracticeday06;

import java.util.Scanner;

public class Ant01 {
	
	public static void main(String[] args) {
	     //Kullan�c�da bir String k�mesi girmesini isteyelim ve Ka� kelimeden
        //olu�tu�unu d�nen java methodu yaz�n�z.
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir kelime grubu grubu giriniz");
		String str = input.nextLine();
		
		System.out.println("Metindeki kelime sayisi: " +kelimeSayisi(str));
		
		input.close();
		
	}
	public static int kelimeSayisi(String str) {
		
		int count=0;
		for (int i = 0; i <str.length(); i++) { //bugun hava cok sicak
			
			if (str.charAt(i)==' ') {
				count++;
			}
			
		}
		count=count+1;
		return count;
	}
}