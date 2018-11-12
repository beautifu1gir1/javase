/*
 * 只要是开头是大写的肯定是类    class
 */
public class Test01a {

	public static void main(String[] args) {

		String s1 = new String("123");
		
		String s2 = new String("123");
		
		
		
//		equals 只是值的相等
		
		System.out.println(s1.equals(s2));
		
//		== 是完全的相等，内容地址还有值都要相等
		
		System.out.println(s1 == s2);
		
	}

}
