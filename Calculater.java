package calculation;
interface addition
{
	void add();
}
interface substration
{
	void sub();
}
interface division
{
	void div();
}
interface multiplicaion
{
	void mul();
}


public class Calculater implements addition,substration,division,multiplicaion
{
	public void add()
	{
		int a,b=4,c=8;
		a=b+c;
		System.out.println("Addition: "+a);
	}
	public void sub()
	{
		int a,b=4,c=8;
		a=b-c;
		System.out.println("Substration: "+a);
	}
	public void div()
	{
		int a,b=4,c=8;
		a=b/c;
		System.out.println("division: "+a);
	}
	public void mul()
	{
		int a,b=4,c=8;
		a=b*c;
		System.out.println("Multiplication: "+a);
	}
	
	
		
}