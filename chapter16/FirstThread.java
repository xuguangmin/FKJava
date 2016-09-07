public class FirstThread extends Thread
{
	private int i;
	//重写run方法，run方法的方法体就是线程执行体
	public void run()
	{
		for (; i < 100; i++) {
			System.out.println(getName() + " " + i);
		}
	}
	public static void main(String[] args)
	{
		for(int i = 0; i < 100; i++) {
			//调用Thread的currentThread()方法获取当前线程
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20) {
				new FirstThread().start();
				new FirstThread().start();
			}
		}
	}
}
