package JavaPrograms;

public class Parsing {

	public static void main(String[] args) {
		
		String S = "12345";
		
		int d = Integer.parseInt(S);
		System.out.println(d);
		System.out.println(d);
		
		double d1 = Double.parseDouble(S);
		System.out.println(d1);
		
		
		float f = Float.parseFloat(S);
		System.out.println(f);
	
		
		String s = String.valueOf(d);
		System.out.println(s.getClass().getSimpleName());
		

	}

	

}
