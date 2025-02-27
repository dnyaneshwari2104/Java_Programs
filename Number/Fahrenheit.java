import java.util.Scanner;

class  Fahrenheit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius:");
		int Celsius = sc.nextInt();
		int Fahrenheit = (9/5)*celsius+32;
		
		System.out.println("degree in Celsius is:"+ Fahreenheit);
		
		
	}
}
