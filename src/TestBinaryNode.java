
public class TestBinaryNode
{
	public static void main(String[] args)
	{
		BinaryNode<String> test = new BinaryNode<String>();
		
		testGetNumberOfNodes(test,1);
		testIsLeaf(test,true);
		testGetData(test,null);
		testHasLeftChild(test,false);
		testHasRightChild(test,false);
		testGetLeftChild(test,null);
		testGetRightChild(test,null);
		
		testSetData(test,"test1");
		testGetData(test,"test1");
		testGetNumberOfNodes(test,1);
		testGetHeight(test,1);
		
		testSetLeftChild(test,new BinaryNode<String>("test2"));
		testGetNumberOfNodes(test,2);
		testSetRightChild(test,new BinaryNode<String>("test3"));
		testGetNumberOfNodes(test,3);
		testHasLeftChild(test,true);
		testHasRightChild(test,true);
		testGetHeight(test,2);
		
		testSetLeftChild(test.getLeftChild(),new BinaryNode<String>("test4"));
		testSetRightChild(test.getLeftChild(),new BinaryNode<String>("test5"));
		testSetRightChild(test.getRightChild(),new BinaryNode<String>("test6"));
		testGetHeight(test,3);
		testGetNumberOfNodes(test,6);
		
		testCopy(test);
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

	public static void testGetNumberOfNodes(BinaryNodeInterface<String> binaryNode, int correct)
	{
		System.out.println("Testing getNumberOfNodes method: ");
		
		int result = binaryNode.getNumberOfNodes();
		
		System.out.print("getNumberOfNodes returns "+result+": ");
		if(result==correct){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testGetHeight(BinaryNodeInterface<String> binaryNode, int correct)
	{
		System.out.println("Testing getHeight method: ");
		
		int result = binaryNode.getHeight();
		
		System.out.print("getHeight returns "+result+": ");
		if(result==correct){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testHasLeftChild(BinaryNodeInterface<String> binaryNode, boolean correct)
	{
		System.out.println("Testing hasLeftChild method: ");
		
		boolean result = binaryNode.hasLeftChild();
		
		System.out.print("hasLeftChild returns "+result+": ");
		if(result==correct){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testHasRightChild(BinaryNodeInterface<String> binaryNode, boolean correct)
	{
		System.out.println("Testing hasRightChild method: ");
		
		boolean result = binaryNode.hasRightChild();
		
		System.out.print("hasRightChild returns "+result+": ");
		if(result==correct){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testCopy(BinaryNodeInterface<String> binaryNode)
	{
		System.out.println("Testing copy method: ");
		
		System.out.print("Copying ... ");
		BinaryNode<String> result = (BinaryNode<String>) binaryNode.copy();
		if(((BinaryNode<String>)binaryNode).equals(result)){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
}
