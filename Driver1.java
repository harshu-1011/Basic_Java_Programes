//Encapsulation 
//prime number

 class N1 
{
 private static int a;
  
  public  int getA()
  {
   return a;
  }
  public  void setA(int a)
  {
		this.a=a;
  }
  
}

class Driver1
{
	public static boolean isPrime(int num)
	{
		int i;
		for(i=2;i<=num-1;i++)
		{
			if(num%i==0)
			break;
		}
		if(num==i)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	
	{
		N1 n=new N1();
		
		int num;
		n.setA(37);
		num=n.getA();
		
		System.out.println(isPrime(37));
	}
	
}


