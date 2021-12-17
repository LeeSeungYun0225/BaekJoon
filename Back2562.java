import java.io.*;

public class Back2562 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a,count =1;
		int max=Integer.parseInt(br.readLine());
		
		for(int i=1;i<9;i++)
		{
			a = Integer.parseInt(br.readLine());
			if(a>max)
			{
				max = a;
				count=i+1;
			}
			
		}
		bw.write(max+"\n"+count);
		bw.flush();
		bw.close();
		br.close();
		
	}
}
