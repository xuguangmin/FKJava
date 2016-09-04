public class ConversionTest
{
	public static void main(String[] args)
	{
		double d = 13.4;
		long l = (long)d;
		System.out.println(l);
		Object obj = "Hello";
		String objStr = (String)obj;
		System.out.println(objStr);
		Object objPri = new Integer(5);
		String str = (String)objPri;
	}
}
