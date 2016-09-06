import java.util.*;

public class CalendarTest
{
	public static void main(String[] args)
	{
		Calendar c = Calendar.getInstance();
		//取出年
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));

		c.set(2003, 10, 23, 12, 32, 23);
		System.out.println(c.getTime());

		//将Calendar的年前推1年
		c.add(Calendar.YEAR, -1);
		System.out.println(c.getTime());
		//将Calendar的月份前推8个月
		c.roll(Calendar.MONTH, -8);
		System.out.println(c.getTime());
	}
}
