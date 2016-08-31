public class Overload
{
	public void test()
	{
		System.out.println("no para");
	}
	public void test(String msg)
	{
		System.out.println("reload test fun " + msg);
	}
	public static void main(String[] args)
	{
		Overload ol = new Overload();
		ol.test();
		ol.test("hello");
	}
}
