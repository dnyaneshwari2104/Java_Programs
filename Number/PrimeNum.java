import java.util.Scanner;
class PrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int den =2;
		while(num<0)
		{		
			for(int i=num; i<=1; i++)
			{
			 if(num%2 !==1)	
			{
				System.out.println("Number is prime :" +num);
			}
			else
			{
				System.out.println("Number is not prime :"+num);
			}
			}
					
		}
		
	}
}
