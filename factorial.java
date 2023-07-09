import java.util.*;
class factorial
{
	public static void main(String[] args)
	{
		int i,fact=1;
		int number;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial Of "+number+"is:"+fact);
	}
}