import java.util.Scanner;

public class Conditional_demo {

	public static void main(String[] args) {
		
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A:");
	a=sc.nextInt();
	System.out.println("Enter B:");
	b=sc.nextInt();
	System.out.println("Enter C:");
	c=sc.nextInt();
		
	if(a>b)
	{
		if(a>c)
		{
		System.out.println("A is greater");
		}
		else
		{
			System.out.println("C is greater");
		}
	}
	
	else if(b>c)
	{
		System.out.println("B is greater");
	}
	
	else
	{
		System.out.println("C is greater");
	}
	
	}

}
