
import java.util.*;
import java.io.*;
public class ScannerFileTest
{
	public static void main(String[] args)
		throws Exception
	{
		Scanner sc = new Scanner(new File("ScannerFileTest.java"));
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}
}

