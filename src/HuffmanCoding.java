
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HuffmanCoding
{
	public static void main(String[] args)
	{
		new HuffmanCoding("test1.txt");
	}
	
	private class Node implements Comparable<Node>
	{
		char letter;
		int count;
		
		private Node()
		{
			new Node('\u0000',0);
		}
		
		private Node(char nodeLetter, int letterCount)
		{
			letter = nodeLetter;
			count = letterCount;
		}
		
		private char getLetter()
		{
			return letter;
		}
		
		private int getCount()
		{
			return count;
		}
		
		private void setLetter(char newLetter)
		{
			letter = newLetter;
		}
		
		private void setCount(int newCount)
		{
			count = newCount;
		}
		
		private boolean equals(Node node)
		{
			if(letter==node.letter){
				return true;
			}
			
			return false;
		}
		
		public String toString()
		{
			return ("Letter: "+letter+", Count: "+count);
		}

		public int compareTo(Node o)
		{
			if(count<o.count){
				return -1;
			}else if(count>o.count){
				return 1;
			}else{
				return 0;
			}
		}
	}
	
	public HuffmanCoding(String fileName)
	{
		int[] characters = new int[26];	
		Node[] nodes = new Node[26];
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
			line = line.toUpperCase();
			char[] letters = line.toCharArray();
			
			for(int i=0;i<letters.length;i++){
				int index = letters[i] - 'A';
				
				characters[index]++;
				
				for(int j=0;j<nodes.length;j++){
					if(nodes[j]!=null){
						if(nodes[j].getLetter()==letters[i]){
							nodes[j].setCount(characters[index]);
							break;
						}
					}else{
						nodes[j] = new Node(letters[i],characters[index]);
						break;
					}
				}
			}
		}
		
		inputStream.close();
		
		ArrayList<Node> sortNodes = new ArrayList<Node>();
		for(int i=0;i<nodes.length;i++){
			if(nodes[i]!=null){
				System.out.println(nodes[i]);
				sortNodes.add(nodes[i]);
			}
		}
		System.out.println();
		
		System.out.println("\nSorting ... ");
		Collections.sort(sortNodes);
		
		for(int i=0;i<sortNodes.size();i++){
			System.out.println(sortNodes.get(i));
		}
		
		System.out.println();
		
		System.out.println("Commencing Huffman Encrypting ... ");
		BinaryTree<Node> huffman = new BinaryTree<Node>();
		for(int i=0;i<sortNodes.size();i++){
			
		}
	}
}
