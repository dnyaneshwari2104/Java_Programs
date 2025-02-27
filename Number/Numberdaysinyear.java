import java.util.Scanner;
class Numberdaysinyear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of minutes :");
		
		
		long minutes = sc.nextLong();
			
		long totalDays= minutes /(60*24);
		int years = (int)( totalDays / 365);
		
		int days =  (int)( totalDays % 365);
		
		System.out.println(minutes +"minutes is approximately"+ years+"years and" +days+"days");
		
		
	}
}
