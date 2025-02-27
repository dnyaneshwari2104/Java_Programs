import java.util.Scanner;

class cylinder
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius and height of a cylinder");
		float radius = sc.nextFloat();
		float height = sc.nextFloat();
		
		double area= 3.14*radius*radius;
		double volume = area*height;
		
		
		System.out.println("The area is   :"+area);
		System.out.println("The Volume  is:"+ volume);
	}
}
