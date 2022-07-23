import java.util.Scanner;

public class Arraydemo1 {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i,j,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("enter "+ (i+1) +" element: ");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		
		System.out.println("sum of array elements: "+ sum);
		System.out.println("array elements are");
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.println("array elements are in ascending order: ");
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.println("array elements are in descending order: ");
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}
		
	}

}
