import java.time.format.*;
import java.time.*;

public class NewFormatterTest
{
	public static void main(String[] args)
	{
		DateTimeFormatter[] formatters = new DateTimeFormatter[]{
			//直接使用常量创建DateTimeFormatter格式器
			DateTimeFormatter.ISO_LOCAL_DATE,
			DateTimeFormatter.ISO_LOCAL_TIME,
			DateTimeFormatter.ISO_LOCAL_DATE_TIME,
			//使用本地化的不同风格来创建DateTimeFormatte格式器
			DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
			DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
			//根据模式字符串来创建DateTimeFormatter格式器
			DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")
		};
		LocalDateTime date = LocalDateTime.now();
		//依次使用不同格式器对LocalDateTime进行格式化
		for(int i = 0; i < formatters.length; i++) {
			//下面两行代码的作用相同
			System.out.println("i = " + i);
			System.out.println(date.format(formatters[i]));
			System.out.println(formatters[i].format(date));
		}
	}
}
