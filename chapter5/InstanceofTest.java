public class InstanceofTest
{
	public static void main(String[] args)
	{
		Object hello = "Hello";
		System.out.println("字符串是否是Object类的实例:" + (hello instanceof Object));
		System.out.println("字符串是否是String类的实例:" + (hello instanceof  String));
		System.out.println("字符串是否是Math类的实例:" + (hello instanceof Math));
		System.out.println("字符串是否是Compareble接口的实例:" + (hello instanceof Comparable));
		String a = "hello";
		System.out.println("字符串是否是Math类的实例:" + (a instanceof Math));

	}
}
