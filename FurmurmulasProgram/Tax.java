import java.util.Scanner;
class Tax 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary per annum:");
		
		double salary = sc.nextDouble();
		
		if(salary>=0 && salary<=1200000)
		{
			System.out.println("No TaX ! aur zyada kamao");
		}
		else if (salary>1200000 && salary<=1600000)
		{
			System.out.println("your chargeble tax Without saving is Rs: ");
		}
		else if (salary>1600000 && salary<=2000000)
		{
			System.out.println("your chargeble tax Without saving is Rs: " );
		}
		else if (salary>2000000 && salary<=2400000)
		{
			System.out.println("your chargeble tax Without saving is Rs: " );
		}
		else
		{
			System.out.println("Inavalid");
		}
	}
}
