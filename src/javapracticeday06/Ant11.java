package javapracticeday06;

public class Ant11 {

	public static void main(String[] args) {
		// while dongusu ile 1 den 100 kadar olan sayilarin toplamini bulalim.
		
		int sum=0, i=100;
		
		while (i !=0) {
			sum+=i;
			--i;
		}
		System.out.println("Sum= " + sum);
}
}
