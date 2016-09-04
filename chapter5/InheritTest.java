class Animal
{
	private void beat()
	{
		System.out.println("心脏跳动...");
	}
	public void breath()
	{
		 System.out.println("吸一口气，吐一口气，呼吸中...");
	}
}
class Bird extends Animal
{
	public void fly()
	{
		 System.out.println("我在天空自由的飞翔...");
	}
}
class Wolf extends Animal
{
	public void run()
	{
		 System.out.println("我在陆地上快速奔跑..");
	}
}
public class InheritTest
{
	public static void main(String[] args)
	{
		Bird b = new Bird();
		b.breath();
		b.fly();

		Wolf w = new Wolf();
		w.breath();
		w.run();
	}
}
