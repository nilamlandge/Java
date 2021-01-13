class School
{
	void schoolA()
	{
		System.out.println("School");
	}
}
class Girls extends School
{
	void GirlsA()
	{
		System.out.println("Girls are in division A");
	}
}
class Boys extends School
{
	void BoysA()
	{
		System.out.println("Boys are in division B");
	}
}
class hierarchical
{
	public static void main(String args[])
	{
		
		
		System.out.println("malpani school");
		System.out.println("Total girls are:23");
		Girls s1 =new Girls();
		s1.GirlsA();
		System.out.println("Total boys are:45");
		Boys s2 =new Boys();
		s2.BoysA();
	}
	
}
