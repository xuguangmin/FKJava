import java.util.*;

public class ScannerKeyBoardTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		/* 增加下面一行将只把回车作为分隔符 */
		//sc.userDelimiter("\n");
		//判断是否还有下一个输入项
		while(sc.hasNext()) {
			//输出输入项
			System.out.println("键盘输入的内容是: " + sc.next());
		}
	}
}
