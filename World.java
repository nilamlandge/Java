class World
{
 void WorldA() 
	{
  	System.out.println("world");
 	}
}

class Countries extends World
{
 void CountriesA() 
	{
 	 System.out.println("country: india");
	 }
}
class State extends Countries
{
 void StateA() 
	{
 	 System.out.println("State: Maharashtra");
	 }
}

 class City
{
 public static void main(String args[]) 
{
  State s = new State();
  s.WorldA();
  s.CountriesA();
  s.StateA();

 }
}

