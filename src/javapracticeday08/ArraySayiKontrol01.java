package javapracticeday08;

import java.util.Arrays;

public class ArraySayiKontrol01 {

	public static void main(String[] args) {
		//ikinci yol
		int arr[]= {12,32,34,54,45};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 34));
		
	}

}
