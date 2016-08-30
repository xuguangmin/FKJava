public class CharTest
{
	public static void main(String[] args)
	{
		char aChar = 'a';
		//使用转移字符来作为字符值
		char enterChar = '\r';
		//使用unicode编码值来指定字符值
		char ch = '\u9999';
		//将输出一个香字
		System.out.println(ch);
		//定义一个疯字
		char zhong = '疯';
		int zhongValue = zhong;
		System.out.println(zhongValue);
	}

}
