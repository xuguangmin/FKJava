class BaseClass
{
	public int book = 6;
	public void base()
	{
		System.out.println("parent class normal method");
	}
	public void test()
	{
		System.out.println("parent class is overlapping method");
	}
}
public class SubClassPoly extends BaseClass
{
	public String book = "轻量级 Java EE";
	public void test()
	{
		System.out.println("sub class overlapping parent class method");
	}
	public void sub()
	{
		System.out.println("sub clas normaly method");
	}
	public static void main(String[] args)
	{
		BaseClass bc = new BaseClass();
		System.out.println(bc.book);
		bc.base();
		bc.test();
		System.out.println("---------------------------------");

		SubClassPoly sc = new SubClassPoly();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		BaseClass ploymophicBc = new SubClassPoly();
		System.out.println(ploymophicBc.book);
		/* 下面调用将执行从父类继承的base方法 */
		ploymophicBc.base();
		/* 下面调用将执行当前类的test方法 */
		ploymophicBc.test();
		
	}
}
