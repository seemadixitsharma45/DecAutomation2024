package decBatch;

public class Assignment1Constructor {

	public Assignment1Constructor() {
System.out.println("default constructor");

	}
	
	
	
	public Assignment1Constructor(int x) {
		this();
		System.out.println("one parameterized constructor");

			}
	
	
	public Assignment1Constructor(int x, int y) {
		
		this(5);
		System.out.println("two parameterized constructor");

			}
	
	
	public static void main(String[] args) {

		Assignment1Constructor obj1=new Assignment1Constructor(12,35);
		
		
		
		
		
		
		
	}
}
