
public class Test {
	
	public static void main(String args[])
	{
		int arr[] = new int[10000];
		initArr(arr);
		
		checkNoSelfNumber(arr);
		printNoSelfNumber(arr);
		
	}
	
	public static void initArr(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = 0;	
		}
	}
	
	public static void checkNoSelfNumber(int[] arr)
	{
		int sum=0;
		int temp;
		for(int i=1;i<arr.length;i++)
		{

			temp = i;
			sum=temp;
			while(temp!=0)
			{
				sum+= temp%10;
				temp = temp/10;
				
			}
			if(sum<=9999)
			{
				arr[sum]+=1;
			}
			
		}
	}
	
	public static void printNoSelfNumber(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				System.out.println(i);
			}
		}
	}
	

}
