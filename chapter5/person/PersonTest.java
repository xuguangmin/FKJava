public class PersonTest
{
	public static void main(String[] args)
	{
		Person p = new Person();
		p.setAge(10);
		System.out.println("age: " + p.getAge());
		p.setName("xugu");
		System.out.println("name: " + p.getName());
	}
}
