import java.util.*;

public class LenientTest
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		//结果是YEAR字段加1，MONTH字段为1
		cal.set(Calendar.MONTH, 13);
		System.out.println(cal.getTime());
		//关闭容错
		cal.setLenient(false);
		cal.set(Calendar.MONTH, 13);
		System.out.println(cal.getTime());
	}
}
