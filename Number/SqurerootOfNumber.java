import java.util.Scanner;
class SqurerootOfNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num= sc.nextInt();
		boolean flag = false;
		
		for(int i=1; i<=num; i++)
		{
			if(i*i==num)
			{
				flag = true;
				System.out.print(i+ "perfect Squre root"+num);
			}
			if(i*i>num)
				break;
		}
			if(!flag)
			{
				System.out.print("doest't having a perfect Squre root"+num);
			}	
	}
}
