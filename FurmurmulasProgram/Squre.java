import java.util.Scanner;
class Squre 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num= sc.nextInt();
		
		System.out.println("Enter a Power");
		int pow = sc.nextInt();
		
		int op=1;
		
		for(int i =1; i<=num;i++)
		{
			op *=num;
			System.out.println(num +"^"+pow+"="+op);
		}
	}
}
