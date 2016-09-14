import java.net.*;
import java.io.*;
import java.util.*;


public class ClientThread  implements Runnable
{
	//该线程负载处理的Socket
	private Socket s;
	//该线程锁处理的Socket对应的输入流
	BufferedReader br = null;
	public ClientThread(Socket s) throws IOException
	{
		this.s = s;
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	}
	public void run()
	{
		try
		{
			String content = null;
			while((content = br.readLine()) != null) {
				System.out.println(content);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}

