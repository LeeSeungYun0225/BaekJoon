import java.io.*;

public class Back2577 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int result = 1;
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = 0;
		}
		for(int i=0;i<3;i++)
		{
			result*=Integer.parseInt(br.readLine());
		}
		
		while(result!=0)
		{
			arr[result%10]++;
			result/=10;
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			bw.write(arr[i]+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
