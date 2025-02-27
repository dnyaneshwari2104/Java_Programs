import java.util.Scanner;

class PoundsconvertKilograms
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of  Pounds");
		double pounds= sc.nextDouble();
		double kilograms=pounds*0.454;
		
		System.out.println(pounds +"pounds"+ kilograms +"kilograms");
	}
}
