import java.io.*;
import java.util.StringTokenizer;


public class Back1546 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine());
		
		
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = findMax(arr);
		float result = returnSum(arr)*100/max/n;
		bw.write(result+"");
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static int findMax(int[] arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
				
			}
		}
		return max;
	}
	public static float returnSum(int[] arr)
	{
		float sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
}
