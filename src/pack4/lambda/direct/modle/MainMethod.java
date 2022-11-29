package pack4.lambda.direct.modle;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		Greeting english = () -> System.out.println("Hi English Greeting");
		Greeting hindi = () -> System.out.println("Hindi Greeting....");
		english.greet();
		hindi.greet();
		
	}

}
