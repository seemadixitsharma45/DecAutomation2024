package decBatch;

public class Arthematic {
	
	
	
	public int sum(int x,int y)
	{
	int z=x+y;
		//System.out.println("Sum of result:" +z);
		return z;
	}
	
	public int subresult(int c,int d)
	{
	int g=c-d;
		//System.out.println("Sub of result:" +g);
		return g;
	}
	
	public void mult(int j,int k)
	{
	int g=j*k;
		System.out.println("Sum of result:" +g);
		
	}
	
	public static void main(String[] args) {

		Arthematic result=new Arthematic();
		 int sumresult=result.sum(15,5);
		 System.out.println("Sum of result:" +sumresult);
		 
		 int subresult1=result.subresult(20,5);
		 System.out.println("Sub of result:" +subresult1);
		 
		 
		 result.mult(sumresult, subresult1);
		 
		 
	}

}
