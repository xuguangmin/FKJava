import java.time.*;
import java.time.format.*;
public class NewFormatterParser
{
	public static void main(String[] args)
	{
		//定义一个任意格式的日期时间字符串
		String str1 = "2014==04==12 01时06分09秒";
		//根据需要解析的日期时间字符串定义解析所用的格式器
		DateTimeFormatter fomatter1 = DateTimeFormatter.ofPattern("yyyy==MM==dd HH时mm分ss秒");
		//执行解析
		LocalDateTime dt1 = LocalDateTime.parse(str1, fomatter1);
		System.out.println(dt1);
		
		//  ----------下面代码再次解析另一个字符串
		String str2 = "2014$$$4月$$$13 20小时";
		DateTimeFormatter fomatter2 = DateTimeFormatter.ofPattern("yyy$$$MMM$$$dd HH小时");
		LocalDateTime dt2 = LocalDateTime.parse(str2, fomatter2);
		System.out.println(dt2);
	}
}
