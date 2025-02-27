import java.util.Scanner;
// 144 2197 196  3375 256
class Series 
{
	public static void main(String[] args) 
	{
		for(int i=12; i<=16; i++)
		{
			if(i%2==0)
			{
				System.out.print((i*i)+ " ");
			}
				if(i%2!=0)
			{
				System.out.print((i*i*i)+ " ");
			}
		}
	    
	}
}

