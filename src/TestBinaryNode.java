
public class TestBinaryNode
{
	public static void main(String[] args)
	{
		BinaryNode<String> test = new BinaryNode<String>();
		testIsLeaf(test,true);
		testGetData(test,null);
		testGetLeftChild(test,null);
		testGetRightChild(test,null);
		testSetData(test,"test1");
		testSetLeftChild(test,new BinaryNode<String>("test2"));
		testSetRightChild(test,new BinaryNode<String>("test3"));
		
	}
	
	public static void testIsLeaf(BinaryNodeInterface<String> binaryNode, boolean correct)
	{
		System.out.println("Testing isLeaf method: ");
		
		boolean result = binaryNode.isLeaf();
		
		System.out.print("isLeaf returns "+result+": ");
		if(result==correct){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testGetData(BinaryNodeInterface<String> binaryNode, String correct)
	{
		System.out.println("Testing getData method: ");
		
		String result = binaryNode.getData();
		
		System.out.print("getData returns "+result+": ");
		if(result==correct){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testGetLeftChild(BinaryNodeInterface<String> binaryNode, BinaryNodeInterface<String> correct)
	{
		System.out.println("Testing getLeftChild method: ");
		
		BinaryNodeInterface<String> result = binaryNode.getLeftChild();
		
		System.out.print("getLeftChild returns "+result+": ");
		if(result==correct){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testGetRightChild(BinaryNodeInterface<String> binaryNode, BinaryNodeInterface<String> correct)
	{
		System.out.println("Testing getRightChild method: ");
		
		BinaryNodeInterface<String> result = binaryNode.getRightChild();
		
		System.out.print("getRightChild returns "+result+": ");
		if(result==correct){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testSetData(BinaryNodeInterface<String> binaryNode, String newData)
	{
		System.out.println("Testing setData method: ");
		
		System.out.print("Setting data ... ");
		binaryNode.setData(newData);
		
		if(binaryNode.getData()==newData){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testSetLeftChild(BinaryNodeInterface<String> binaryNode, BinaryNodeInterface<String> newChild)
	{
		System.out.println("Testing setLeftChild method: ");
		
		System.out.print("Setting left child ... ");
		binaryNode.setLeftChild(newChild);
		
		if(binaryNode.getLeftChild()==newChild){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testSetRightChild(BinaryNodeInterface<String> binaryNode, BinaryNodeInterface<String> newChild)
	{
		System.out.println("Testing setRightChild method: ");
		
		System.out.print("Setting right child ... ");
		binaryNode.setRightChild(newChild);
		
		if(binaryNode.getRightChild()==newChild){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testGetHeight(BinaryNodeInterface<String> binaryNode, int correct)
	{
		
	}
	
	public static void testGetNumberOfNodes(BinaryNodeInterface<String> binaryNode, int correct)
	{
		
	}
	
	public static void testCopy(BinaryNodeInterface<String> binaryNode)
	{
		
	}
}
