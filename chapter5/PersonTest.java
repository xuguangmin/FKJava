class Person
{
	public String name;
	public static int eyeNum;
}

public class PersonTest
{
	public static void main(String[] args)
	{
		System.out.println("Person de eyenum class val " + Person.eyeNum);
		Person p = new Person();
		System.out.println("p var de name val is: " + p.name + "p elem de eyeNum val is: " + p.eyeNum);

		p.name = "hahahha";
		p.eyeNum = 2;
		System.out.println("p var de name is: " + p.name + "p elem eyeNum val is : " + p.eyeNum);
		
		System.out.print("Person de eyeNum class val is: " + Person.eyeNum);
		Person p2 = new Person();
		System.out.println("p2 elem de eyeNum val is : " + p2.eyeNum);

	}
}
