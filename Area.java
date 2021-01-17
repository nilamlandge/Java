import java.util.*;
class Area 
{
	float length;
	float breadth;
	float area;
	Area()
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	
	Area(float l,float b)
	{
		length=l;
		breadth=b;
		
	}
	 void calculateArea()
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Area of geometric shape: ");
	}	
}
class Rectangle extends Area
{
	float l,b,a;
	Rectangle()
	{
			
	}
	Rectangle(float l,float b)
	{
		super(l,b);
		
	}
	void accept()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length: ");
		l=sc.nextInt();
		System.out.println("Enter breadth: ");
		b=sc.nextInt();
	}
	void calculateArea()
	{
	
		a=l*b;
		System.out.println("Area of Reactangle: "+a);
	
	}
}

class Triangle extends Area
{
	float l,b,a;
	Triangle()
	{
	
	}
	Triangle(float l,float b)
	{
		super(l,b);
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length: ");
		l=sc.nextInt();
		System.out.println("Enter breadth: ");
		b=sc.nextInt();
	}
	void calculateArea()
	{
		a=l*b/2;
		System.out.println("Area of Triangle: "+a);
	}
}
class Square extends Area
{
	float l,a;
	Square()
	{
	
	}
	Square(float l)
	{
		super(l,l);
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length: ");
		l=sc.nextInt();
	}
	void calculateArea()
	{
		a=l*l;
		System.out.println("Area of Square: "+a);
	}
}
class TotalArea
{
	public static void main(String args[])
	{
		Area a1=new Area();
		a1.calculateArea();    
		Rectangle r=new Rectangle();
		r.accept();
		r.calculateArea();
		Triangle t=new Triangle();
		t.accept();
		t.calculateArea();
		Square s=new Square();
		s.accept();
		s.calculateArea();
	}
}
