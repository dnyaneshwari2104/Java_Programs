import java.util.Scanner;

class  Numberofyear
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of minutes");
		
		Long minutes = sc.nextLong();
		
		Long totalDays = minutes/(60*24);
		Long days = (long)(totalDays/365);
		Long years = (long)(totalDays%365);
		
		System.out.println(days +" days" + years + "years");
	}
}
