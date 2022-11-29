package pack2.anonymous.model;

public class WellWisherMain 
{
	public static void wish(Greeting greet)
	{
		greet.greet();
	}
	
	public static void main(String[] args)
	{
		
		wish(new Greeting() {
			@Override
			public void greet() 
			{
				System.out.println("Good morning EnglishGreeting");
				
			}
		});
		
		System.out.println("============================");
		wish(new Greeting() {
			@Override
			public void greet()
			{
				System.out.println("HindiGreeting");
			}
		});
		System.out.println("============================");		
	}

}
