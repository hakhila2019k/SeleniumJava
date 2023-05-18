package JavaPrograms;

public class SettersGetters {
	
	
	static int a = 25;
	int b=25;
	
	private int number;
	private int sal ;
	private String Name;
	
	
	public int getNumber()
	{
		return number;
	}
	
	public void setNumber(int number) 
	{
		this.number = number;
		
	}
	
	public int getSal()
	{
		return sal;
	}
	
	public void setSal(int sal)
	{
		this.sal = sal;
			
	}
	
	public String getName()
	{
		return Name;
		
	}
	
	public void setName(String name)
	{
		Name = name;
		
	}
	
	void details()
	{
		System.out.println(Name);
		System.out.println(number);
		System.out.println(sal);
	}
	
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	
//	SettersGetters akh = new SettersGetters();
//	
//	akh.setName("Peddireddy");
//	akh.setNumber(254);
//	akh.setSal(4500000);
//	akh.details();
	
	

}
