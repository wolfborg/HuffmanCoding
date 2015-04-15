
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class HuffmanCoding
{
	public static void main(String[] args)
	{
		
	}
	
	public HuffmanCoding(String fileName)
	{
		Scanner inputStream = null;
		
		try{
			inputStream = new Scanner(new File(fileName));
		}catch (FileNotFoundException e) {
			System.out.println("Error opening file: "+fileName);
			System.exit(0);
		}
		
		System.out.println("Reading '"+fileName+"' ... ");
		while(inputStream.hasNextLine()){
			String line = inputStream.nextLine();
			char[] letters = line.toCharArray();
			
			for(int i=0;i<letters.length;i++){
				if(Character.isAlphabetic(letters[i])){
					
				}
			}
		}
		
		inputStream.close();
	}
}
