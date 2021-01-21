import java.io.*;
class PrimeNumber
{
	public static void main(String arg[])throws IOException
	{
		int i,rem,sum=0,num,temp;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number: ");
		num=Integer.parseInt(br.readLine());
		temp=num;
		System.out.println("--------------");
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("Number is Not Prime Number");
				break;
			}
			else
			{
				System.out.println("Number is Prime Number");
				break;

			}
		}
	}
}