class ArrayLargh1
{
public static int getLargh(int[]a,total)
{
	int temp;
	for(int i=0;i<total;i++)
	{
	if(a[i]>a[j])
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		}
}
		return a[total-1];


		public static void main(String[] args)
		{
		int a[]={1,3,5,6,8,9};
		int b[]={22,55,77,90,77};
		System.out.println("\n enter larges"+getLargh(a,4));
		System.out.println("\n enter larges"+getLargh(b,4));
		}
		}