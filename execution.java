package practise;

public class execution {
	public static void main(String []args) {
		//object creation of a class
		Computer refvar = new Computer();
		//class name + reference variable = new(keyword) + constructor
		refvar.year = 2019;
		refvar.model = "Asus";
		System.out.println(refvar.year +" "+ refvar.model);
		Computer refvar2 = new Computer(2019);
		
		Computer refvar3 = new Computer("Asus");
		
		System.out.println(refvar.display);
		System.out.println(Computer.keys);
		
		
		//method
		method method = new method();
		method.getaddress();
		
		method.gettime();
		int newvalue = method.calculator(8, 7);
		System.out.println(newvalue);
		
		int nvalue =  method.calculator2(5, 6);
		System.out.println(nvalue);
	
		
	}
}
