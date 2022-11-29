package pack1.normal.java.model;

public class WellWisherMain 
{
	public static void wish(Greeting greeting)
	{
		System.out.println("wish() method");
		greeting.greet();
	}
	
	public static void main(String[] args)
	{
		wish(new HindGreeting());
		System.out.println("==========");
		wish(new EnglishGreeting());
		
	}

}
