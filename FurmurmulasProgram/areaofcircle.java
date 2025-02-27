import java.util.Scanner;
class areaofcircle 
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Radius:");
		float r=sc.nextInt();
		
	    final float pi=22/7;
		float area= pi*r*r;
		
		 
		
		System.out.println("Area of circle of radius:"+ r +  "is"  + area);
		
		
	}
}
