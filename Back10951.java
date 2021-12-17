import java.io.*;
import java.util.StringTokenizer;

public class Back10951 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String str = new String();
		
		while((str = br.readLine())!= null)
		{
			int a,b;
			st= new StringTokenizer(str," ");
			a= Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write(a+b + "\n");
			
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
