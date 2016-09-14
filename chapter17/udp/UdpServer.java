public class UdpServer
{
	public static final int PORT = 30000;
	//定义每个数据报的大小最大为4KB
	private static final int DATA_LEN = 4096;
	//定义接收网络数据的字节数据
	byte[] inBuff = new byte[DATEA_LEN];
	//以指定字节数组创建准备接收数据的DatagramPacket对象
	private DatagramPacket inPacket = new DatagramPacket(inBuff, inBuff.length);
	//定义一个用于发送的DatagramPacket对象
	private DatagramPacket outPacket;
	//定义一个字符串数组，服务器端发送该数组的元素
	String[] books = new String[] 
	{
		"FK Java",
		"Java EE",
		"Android",
		"Ajax"
	};
	public void init() throws IOException
	{
		try (DatagramSocket socket = new DatagramSocket(PORT))  //创建DatagramSocket对象
		{
			//采用循环接收数据
			for(int i = 0; i < 1000; i++) {
				
			}
		}
	}
}
