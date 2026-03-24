class Mobile{
	String brand;
	int price;
	String network;
	static String name;

	// using static block we can initialize static variables.
	static {
		name="Phone";
		System.out.println("in static block");
	}
	
	public Mobile() {
		brand="";
		price=200;
//		name="Phone";
		System.out.println("in constructor");
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
	
}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		// This line dynamically loads the Mobile class into the JVM at runtime without creating any object.
		Class.forName("Mobile");
		
//		Mobile obj1=new Mobile();
//		obj1.brand="Apple";
//		obj1.price=1500;
//		Mobile.name="SmartPhone";
//		
//		Mobile obj2=new Mobile();

	
	}
}
