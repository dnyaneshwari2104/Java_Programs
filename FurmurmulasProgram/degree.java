import java.util.Scanner;

class degree
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number is:");
		double celsius = sc.nextDouble();
		System.out.println("Celsius is:"+celsius);
		double fahrenheit = (9.0/5)*celsius+32;
		
		System.out.println("fahrenheit is:"+fahrenheit);
	}
}
