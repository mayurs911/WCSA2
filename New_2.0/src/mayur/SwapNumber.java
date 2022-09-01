package mayur;

public class SwapNumber {
	public static void main(String[] args) {

		int a = 10, b = 20;
		System.out.println("before Swap" + a +"  "+ b);
		
		int t=a;
		a=b;
		b=t;
		System.out.println("after Swap" + a +"  "+ b);
	}
}
