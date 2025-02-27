import java.util.Scanner;
class CuurencyConvertor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("   Currency Convertor");
		System.out.println("");
		System.out.print("Enter the Amount(INR) :");
		
		float inr = sc.nextFloat();
		System.out.println();
		
		System.out.println(" List Of Currency");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println("5. JPY");
		System.out.println(".6 RUB");
		System.out.println();
		String Curr = sc.next().toUpperCase();
		
		float conCurr=0;
		if(Curr.equals("USD")){
			conCurr = inr/86.56f;
			System.out.println(inr +" INR = "+conCurr+" USD");
			
		}else if(Curr.equals("EUR")){
			conCurr = inr/90.25f;
			System.out.println(inr +" INR = "+conCurr+" EUR");	
			
		}else if(Curr.equals("GBP")){
			conCurr = inr/107.65F;
			System.out.println(inr +" INR = "+conCurr+" GBP");
			
		}else if(Curr.equals("PKR")){
			conCurr = inr/0.310f;
			System.out.println(inr +" INR = "+conCurr+" PKR");	
			
		}else if(Curr.equals("JPY")){
			conCurr = inr/0.55f;
			System.out.println(inr +" INR = "+conCurr+" JPY");	
				
		}else if(Curr.equals("RUB")){
			conCurr = inr/0.88f;
			System.out.println(inr +" INR = "+conCurr+" RUB");		
				
		}else{
			System.out.println("Invalid Option");
			
		}	
	}
}
