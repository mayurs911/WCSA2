package mayur;

public class elseIfLadder1 {
	public static void main(String[] args) {
		int a=2;
		if(a%2==0)
		{
			System.out.println("even");
		}
		else if(a%2==0 && a%4==0)
		{
			System.out.println("even1");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
