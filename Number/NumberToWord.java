import java.util.Scanner;

class NumberToWord 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		switch (num)
		{
		case 1 :
			{
			System.out.println(num+ "");
		     break;
			}
		case 2 :
			{
			System.out.println(num+ "");
		     break;
			}
		case 3 :
			{
			System.out.println(num+ "Three");
		     break;
			}
		case 4 :
			{
			System.out.println(num+ "Four");
		     break;
			}
		}
	}
}
