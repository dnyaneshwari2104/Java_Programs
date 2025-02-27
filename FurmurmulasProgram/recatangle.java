import java.util.Scanner;

class recatangle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a area and perimeter of rectangle with width and height :");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		
		double area= width*height;
		
		
		System.out.println("perimeter is:"+area);
		
		
	}
}

