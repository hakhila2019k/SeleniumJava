package JavaPrograms;

public class AmbuityClass {
	    public static void main(String[] args) {
	        Parent1 obj = new Child();
	        System.out.println(obj.name); // ambiguity, both parent classes have a member with the same name
	    }
	}
	class Parent1 {
	    String name = "Parent1";
	}
	class Parent2 {
	    String name = "Parent2";
	}
	class Child extends Parent1 {
	    // child class inherits from both parent classes
	}
	

