import java.net.*;
import java.io.*;
import java.util.*;

public class ServerThread implements Runnable
{
	//定义当前线程所处理的Socket
	Socket s = null;
	BufferedReader br = null;
	public ServerThread(Socket s) throws IOException
	{
		this.s = s;
		//初始化该Socket对应的输入流
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	}
	public void run()
	{
		 try {
		 	String content = null;
			//采用循环不断的从Socnet中读取客户端发过来的数据
			while((content = readFromClient()) != null) {
				// 遍历socketList中的每个Socket
				//将读到的内容向每个Socket发送一次
				for(Socket s : MyServer.socketList) {
					PrintStream ps = new PrintStream(s.getOutputStream());
					ps.println(content);
				}
			}
		 }
		 catch (IOException e) {
		 	e.printStackTrace();
		 }
	}
	//读取客户端数据的方法
	private String readFromClient()
	{
		try {
			return br.readLine();
		}
		catch(IOException e) {
			// 删除该Socet
			MyServer.socketList.remove(s);
		}
		return null;
	}

}
