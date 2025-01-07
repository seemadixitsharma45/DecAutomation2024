package decBatch;

public class Assignment2 {
	/*Assignment2
((((10*2)-2)+2)-2)/2
(((20-2)+2)-2)/2
((18+2)-2)/2
(20-2)/2
18/2
9*/

	public int mult1(int a, int b) {
		int result1=a*b;
		System.out.println("The result of muult :"+result1);
		return result1;
	}
	
	
	public int minus1(int a, int b) {
		int result2=a-b;
		System.out.println("The result of minus :"+result2);
		return result2;
	}
	
	public int sum1(int a, int b) {
		int result3=a+b;
		System.out.println("The result of sum :"+result3);
		return result3;
	}
	
	
	public int minus2(int a, int b) {
		int result4=a-b;
		System.out.println("The result of minus :"+result4);
		return result4;
	
	}
	
	public void div1(int a, int b) {
		int result5=a/b;
		System.out.println("The result of div :"+result5);
		
	
	}
	
	public static void main(String[] args) {
	
		
		System.out.println("Exection start");
		Assignment2 v1=new 	Assignment2();
		int ans1=v1.mult1(10,2);
		
		int ans2=v1.minus1(ans1,2);
		
		int ans3=v1.sum1(ans2,2);
		int ans4=v1.minus2(ans3,2);
		
		v1.div1(ans4,2);
		
	}

}
