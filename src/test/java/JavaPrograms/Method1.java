package JavaPrograms;

public class Method1 {
	
	int Number;
	String Name;
	int Phone;
	int roll;
	String Sec;
	
	void display()
	{
		System.out.println(Number + Name +Phone +roll+Sec);
	}
	void Data(int N,String Naam,int Phon,int rol,String sec)
	{
		Number = N;
		Name =Naam;
		Phone=Phon;
		roll = rol;
		Sec = sec;
		
	}
	Method1(int num,String Nam,int ph,int rl,String sy)
	{
		Number = num;
		Name = Nam;
		Phone = ph;
		roll = rl;
		Sec = sy;
		
	}

}
