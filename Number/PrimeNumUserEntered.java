import java.util.Scanner;
class PrimeNumUserEntered 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Range :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		boolean flag;
		if(n1>n2)
			n1=2;
		for(int i=n1; i<n2; i++)
		{
			flag=false;
			for(int j=2; j<i; j++)
			{
				if(i%j ==0)
			    {
				flag=true;
			    }
		  }
		if(!flag)
			System.out.println(i);
	  }
   }
}
