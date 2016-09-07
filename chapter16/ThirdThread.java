import java.util.concurrent.*;

public class ThirdThread
{
	public static void main(String[] args)
	{
		//创建Callable对象
		ThirdThread rt  = new ThirdThread();
		//先使用Lambda表达式创建Callable<Integer>对象
		//使用FutureTask来包装Callable对象
		FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>)()->{
			int i = 0;
			for(; i< 100; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
			return i;
		});
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20) {
				new Thread(task, "you return value").start();
			}
		}

		try{
			//获取线程返回值
			System.out.println("子线程的返回值:" + task.get());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
