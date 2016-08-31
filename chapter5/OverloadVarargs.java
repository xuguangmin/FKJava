public class OverloadVarargs
{
	public void test(String msg)
	{
		System.out.println("only one string parameter of test");
	}
	public void test(String... books)
	{
		System.out.println("*** para test ***");
	}

	public static void main(String[] args)
	{
		OverloadVarargs olv = new OverloadVarargs();
		olv.test();
		olv.test("aa", "bb");
		olv.test("aa");
		olv.test(new String[] {"aa"});
	}
}
