import java.util.*;
import java.net.*;
import java.io.*;

public class MyServer
{
	//定义保存所有Socket的ArrayList，并将其包装为线程安全的
	public static List<Socket> socketList = Collections.synchronizedList(new ArrayList<>());
	public static void main(String[] args) throws IOException
	{
		ServerSocket ss = new ServerSocket(30000);
		while(true) {
			Socket s = ss.accept();
			socketList.add(s);
			new Thread(new ServerThread(s)).start();
		}
	}
}
