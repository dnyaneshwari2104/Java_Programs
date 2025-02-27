import java.util.Scanner;
class  ComputingBMI
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight");
		float weight= sc.nextFloat();
		
		System.out.println("Enter height");
		float height= sc.nextFloat();
		
		float pound=0.43359237f;
		float inch = 0.0254f;
		
		float kilograms=weight*pound;
		float meter = height*inch;
		
		float bmi = kilograms/(meter*meter);
		
		
		System.out.println("BMI IS" + bmi);
	}
}
