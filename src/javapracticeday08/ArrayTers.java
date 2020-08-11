package javapracticeday08;

import java.util.Arrays;

public class ArrayTers {//Arrayin tersini alma

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr []= {"Günes","Ari","Cicek","Bal"};
        Arrays.sort(arr); 
        System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]+" ");
		}
		
		
	}
}
