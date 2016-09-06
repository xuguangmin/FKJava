import java.math.*;

public class BigDecimalTest
{
	public static void main(String[] args)
	{
		BigDecimal f1 = new BigDecimal("0.05");
		BigDecimal f2 = new BigDecimal(0.01);
		BigDecimal f3 = new BigDecimal(0.05);
		System.out.println("使用String作为BigDecimal构造器参数:");
		System.out.println("0.05 + 0.01 = " + f1.add(f2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
}
