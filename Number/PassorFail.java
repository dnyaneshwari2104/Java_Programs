import java.util.Scanner;

class PassorFail 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks :");
		float marks = sc.nextFloat();
		
		float per =(marks/600)*100;
		String op= (per>=35)?("Pass"):("Fail");
		
		System.out.println(op);
	}
}
