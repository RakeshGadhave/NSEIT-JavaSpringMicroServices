import java.util.Scanner;
public class Sum_Of_Odd_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = s.nextInt();
	    int i,sum=0;
	    for(i = 0;i<=num;i++)
	    {
	    	if(i%2!=0) 
	    	{
	    		sum=sum+i;
	    	}
	    }
	    System.out.println(sum);
	    
	}

}
