package pack3.lambda.model;

public class WellWisher 
{
	public static void wish(Greeting greet)
	{
		greet.greet();
		
	}
	
	public static void main(String[] args) 
	{
		wish(() -> System.out.println("GoodMoring EnglisgGreeting"));
		
		wish(() -> System.out.println("Hindi Greeting"));
		
	}
	

}
