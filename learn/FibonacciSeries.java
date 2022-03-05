import java.util.Scanner;
public class FibonacciSeries {
	
	public static void main(String[] args) 
	{ 
		System.out.println("Enter First Number.");
	Scanner S=new Scanner(System.in);
	int p=S.nextInt();

	int r=p;
	System.out.println(p+" "+r);
	 
	int a;

	for(int i=1;i<=5;i++)
	{
		a=p+r;
		System.out.println(" "+ " "+a);
		p=r;
		r=a;

	int sum=0;
	sum+=a;
	a++;

	System.out.println("sum = "+sum);
		}
	}
}
	
