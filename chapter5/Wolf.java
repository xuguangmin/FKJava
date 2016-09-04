class Creature
{
	public Creature()
	{
		System.out.println("Creature no para");
	}
}
class Animal extends Creature
{
	public Animal(String name)
	{
		System.out.println("Animal with a para" + "name:" + name);
	}
	public Animal(String name, int age)
	{
		this(name);
		System.out.println("Animal with two para" + "age:" + age);
	}
}
public class Wolf extends Animal
{
	public Wolf()
	{
		super("hui tai lang", 3);
		System.out.println("wolf no para ");
	}
	public static void main(String[] args)
	{
		 new Wolf();
	}
}



