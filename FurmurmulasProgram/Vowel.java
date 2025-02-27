import java.util.Scanner;
class Vowel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Username :");
		String un = sc.next();
		int len=un.length();
		
		for(int i=0; i<=len; i++)
		{
			char ch=un.charAt(i);
			if((ch=='A' || ch =='a') || (ch=='E' || ch =='e') (ch=='I' || ch =='i')  (ch=='O' || ch =='o')  (ch=='U' || ch =='u'))
			{
				System.out.println((un.charAt(i))+ " ");
			}
		}
	}
}
