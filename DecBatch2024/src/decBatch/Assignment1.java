package decBatch;

public class Assignment1 {

	/*((((10+2)+2)-2)*2)/2
	(((12+2)-2)*2)/2
	((14-2)*2)/2
	(12*2)/2
	24/2
	12*/


	
	
	public int sum(int a, int b, int c)
	
	{
	int d=(a+b)+c;
	System.out.println("Sum of resullt:"+d);
	return d;
	}
	
	
	public int sub(int d, int e)
	
	{
	int f=d-e;
	System.out.println("Sub of resullt:"+f);
	return f;
	}
	
	
public int mult(int f, int g)
	
	{
	int h=f*g;
	System.out.println("mult of resullt:"+h);
	return h;
	}
	

public void div(int h, int i)

{
int j=h/i;
System.out.println("div of resullt:"+j);

}


	public static void main(String[] args) {

		
		System.out.println("start");
		Assignment1 ref_assign=new 	Assignment1();
	int sumresult1=	ref_assign.sum(10,2,2);
	
	
	int subresult=ref_assign.sub(sumresult1,2);
	
	int multresult1=ref_assign.mult(subresult,2);
	
	ref_assign.div(multresult1,2);
	}


	

	

}
