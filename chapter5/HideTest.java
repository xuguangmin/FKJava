class Parent
{
	public String tag = "FK Java Jiang yi";
}
class Derived extends Parent
{
	private String tag = "Qing Liang Ji Java EE";
}
public class HideTest
{
	public static void main(String[] args)
	{
		Derived d = new Derived();
		System.out.println(((Parent)d).tag);
	}
}
