import java.util.Scanner;
class Username 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String un=sc.next().toUpperCase();
		int len = un.length();
		for(int i=0; i<len; i++)
		{
			System.out.println(un.charAt(i));
		}
	}
}
