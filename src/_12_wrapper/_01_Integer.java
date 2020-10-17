package _12_wrapper;

public class _01_Integer {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = 10;
		
		//Integer --> String
		String str = i1.toString();
		System.out.println(str instanceof String);

		//String --> Integer
		int num = Integer.parseInt("10");	//String(ref type) --> int (primitive type)
		Integer refNum = Integer .valueOf(num);
		
		
	}
}
