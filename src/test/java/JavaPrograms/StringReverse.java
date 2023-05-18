package JavaPrograms;

public class StringReverse {

	public static void main(String[] args) {
		String s = "WelCome";
		System.out.println(s.length());
		
		StringBuffer sb = new StringBuffer();
		StringBuffer s1 = sb.append("Welcome");
		System.out.println(s1);
		s1.append("Love");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		
		
		StringBuilder Sb = new  StringBuilder();
		StringBuilder s2 =Sb.append("Love You Dear");
		System.out.println(s2);
		s2.append("  Annapureddy Akhila");
		System.out.println(s2);
		s2.reverse();
		System.out.println(s2);
		
	}

}
