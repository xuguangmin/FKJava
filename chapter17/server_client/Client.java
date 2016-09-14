import java.net.*;
import java.io.*;

public class Client
{
	public static void main(String[] args) throws Exception
	{
		Socket socket = new Socket("127.0.0.1", 30000);
		BufferedReader br = new BufferedReader(
			new InputStreamReader(socket.getInputStream())
		);
		String line = br.readLine();
		System.out.println("来自服务器的数据:" + line);
		br.close();
		socket.close();
	}
}
