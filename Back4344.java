import java.io.*;
import java.util.StringTokenizer;

public class Back4344 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder str = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n2 = Integer.parseInt(st.nextToken());
			int[] arr = new int[n2];
			double count=0;
			
			for(int j=0;j<n2;j++)
			{
				arr[j]=Integer.parseInt(st.nextToken());
				
			}
			int average = getAverage(arr);
			
			for(int j=0;j<n2;j++)
			{
				if(arr[j]>average)
				{
					count++;
				}
			}
			String stt="";
			str.append(String.format("%.3f",Math.round(count*100000/(double)n2)/1000.0));
			str.append("%\n");
			
			
		}
		bw.write(str.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}
	public static int getAverage(int[] arr)
	{
		int sum = 0;
		int aver=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		aver = sum/arr.length;
		
		return aver;
	}
}
