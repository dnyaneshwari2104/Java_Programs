import java.util.Scanner;
class FascinatingNumber 
{                                            //327 is fascinatingNumber.
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number");
		int num=sc.nextInt();
		String str =num+""+(num*2)+(num*3);
		boolean flag =true;
		for(char i='1'; i<='9'; i++)
		{
			int cnt =0;
			
			for(int j=0; j<str.length();j++)
			{
				char ch =str.charAt(j);
				if(ch==i)
					cnt++;
			}
			if(cnt!=1)
			{
				flag =false;
				break;
			}
		}
		if(flag){
		System.out.println(num+" is FascinatingNumber");
		}else
			{
				System.out.println(num+" is not FascinatingNumber");
			}
	}
}
