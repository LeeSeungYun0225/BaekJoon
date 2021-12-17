import java.io.*;

public class Back8958 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n= Integer.parseInt(br.readLine());
		int score = 1;
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			
			String str = br.readLine();
			for(int j = 0;j<str.length();j++)
			{
				if(str.charAt(j)=='O')
				{
					sum+=score;
					score++;

				}
				else
				{
					score=1;
				}
			}
			bw.write(sum+"\n");
			score=1;
			sum=0;
		}
		
		bw.flush();
		bw.close();
		br.close();
		
		
		
	}
}
