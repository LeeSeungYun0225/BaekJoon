import java.io.*;
import java.util.StringTokenizer;

public class Back10818 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n= Integer.parseInt(br.readLine());
		
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min=0;
		int max=0;
		arr[0] = Integer.parseInt(st.nextToken());
		min=arr[0];
		max =arr[0];
		for(int i=1;i<n;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]<min)
			{
				min = arr[i];
			}
			else if(arr[i] >max)
			{
				max= arr[i];
			}
		}
		bw.write(min+" "+max);
		bw.flush();
		bw.close();
		br.close();
		
	}
}
