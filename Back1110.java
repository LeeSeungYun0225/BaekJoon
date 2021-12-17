import java.io.*;

public class Back1110 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number = Integer.parseInt(br.readLine());
		
		int first = number/10;
		int last = number%10;
		int count = 0;
		int temp;
		do
		{	
			temp = last;
			last = (first+last)%10;
			first = temp;
			
			count++;
		}while(first*10+last !=number);
		
		bw.write((count+"").toString());
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
