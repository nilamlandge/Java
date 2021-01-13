class Multiplication1
{  
	static int multi(int a,int b)
	{
		return a*b;
	}  
	static int multi(int a,int b,int c)
	{
		return a*b*c;
	}  
}  
class Result
{  
 public static void main(String[] args)
	{  
		System.out.println(Multiplication1.multi(16,12));  
		System.out.println(Multiplication1.multi(16,12,20));  
	}
}  