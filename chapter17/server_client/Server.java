import java.net.*;
import java.io.*;

public class Server
{
	public static void main(String[] args) throws Exception
	{
		//创建一个ServerSocket, 用于监听客户端比Socket的链接请求
		ServerSocket ss = new ServerSocket(30000);
		while(true)
		{
			Socket s = ss.accept();
			PrintStream ps = new PrintStream(s.getOutputStream());
			ps.println("您好，收到了服务器的祝福");
			ps.close();
		}
	}
}
