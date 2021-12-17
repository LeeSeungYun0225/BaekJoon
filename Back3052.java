import java.io.*;


public class Back3052 {
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[] = new int[42];
		initArr(arr);
		int count = 0;
		
		
		for(int i=0;i<10;i++)
		{
			arr[(Integer.parseInt(br.readLine()))%42]++;
		}
		count = counter(arr);
		bw.write(count+"");
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static void initArr(int[] arr)
	{	
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = 0;
		}
	}
	
	public static int counter(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				count++;
			}
		}
		
		return count;
	}
}
