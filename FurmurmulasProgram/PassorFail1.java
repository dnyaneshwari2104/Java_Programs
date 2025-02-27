import java.util.Scanner;

class PassorFail1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks :");
		float marks = sc.nextFloat();
		
		float per =(marks/100)*600;
		String op= (per>=75)?"Grade A with" +per+"%":
		           (per>=60)?"Grade B with" +per+"%":
		           (per>=35)?"Grade C with" +per+"%":
			       "Failed";
		
		System.out.println(op);
	}
}

