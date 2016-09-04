public class Ostrich extends Bird
{
	
	public void fly()
	{
		System.out.println("I can't fly in the sky...");
	}
	public void callOverridedMethod()
	{
		super.fly();
	}
	public static void main(String[] args)
	{
		Ostrich os = new Ostrich();
		os.fly();
		os.callOverridedMethod();
	}
}
