package textfiles;

import	java.io.IOException;


public class FileData 
{
	public static void main(String[] args) throws IOException
	{
		String file_name="/Users/takipimbp1/file2.txt";
		
		try 
		{
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			
			int i;
			for ( i=0; i < aryLines.length; i++ ) {
			System.out.println( aryLines[ i ] ) ;
			}
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
}
