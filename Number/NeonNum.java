import java.util.Scanner;
class NeonNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a Number");
		
		int num = sc.nextInt();
		int sum =0;
		
		int Sqr=num*num;
		
		for(int i=Sqr; i>0; i/=10)
			int rev =i%10;
			sum+ =rev;
		
		if(sum==num)
			System.out.println(num + " is NeonNumber")
		else
			System.out.println(num+ " is not NeonNumber")
			
	}
}
