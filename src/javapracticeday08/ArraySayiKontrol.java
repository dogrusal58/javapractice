package javapracticeday08;

import java.util.Arrays;

public class ArraySayiKontrol {

	public static void main(String[] args) {
		// Bir int Array išerisinde  aradigimiz sayiyi kontrol edelim.
		//[12,32,34,54,45] 
		int [] sayilar = {12,32,34,54,45};
		
		for (int i = 0; i < sayilar.length; i++) {
			if(String.valueOf(sayilar[i]).contains("13")) {
				System.out.println("Aradiginiz deger var");
				break;
				
			}else {
				System.out.println("Aradiginiz deger yok");
				break;
			}
				
			
			
		}
		

	}
}