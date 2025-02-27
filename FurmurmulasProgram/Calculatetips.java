import java.util.Scanner

class Calculatetips 
{
	public static void main(String[] args) 
		
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subtotal:");
		
		double subtotal=sc.nextdouble();
		double rate = sc.nextdouble();
		
		double rate =rate/10;
		double subtotal = subtotal/15%;
		double total = rate+subtotal;
		
		
		System.out.println("the tip is:"+rate)
		System.out.println("Total is: "+ subtotal)
	}
}
