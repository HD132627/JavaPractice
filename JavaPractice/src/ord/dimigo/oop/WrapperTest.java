package ord.dimigo.oop;

public class WrapperTest {

	public static void main(String[] args) {
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
		
		Integer num1 = new Integer(1000);
		Integer num2 = new Integer(1000);
		if (num1 == num2) {
			System.out.println("같은 객체");
		}
		else {
			System.out.println("다른 객체");
		}
		
		if(num1.equals(num2)) {
			System.out.println("같은 값");
		}
		else {
			System.out.println("다른 값");
		}
		
		// Boxing (Primitive -> Reference)
		Integer obj1 = new Integer(1000);
		Double obj2 = new Double("3.14");
		
		Integer obj3 = Integer.valueOf(2000);
		Double obj4 = Double.valueOf("3.14");
		
	
		
	}
}
