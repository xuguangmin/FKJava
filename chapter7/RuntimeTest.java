public class RuntimeTest
{
	public static void main(String[] args)
	{
		//获取JAVA程序关联的运行时对象
		Runtime rt = Runtime.getRuntime();
		System.out.println("处理器数量: " + rt.availableProcessors());
		System.out.println("空闲内存数:" + rt.freeMemory());
		System.out.println("总内存数:" + rt.totalMemory());
		System.out.println("最大可用内存数:" + rt.maxMemory());
	}
}
