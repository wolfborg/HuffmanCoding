
public class TestBinaryTree
{
	public static void main(String[] args)
	{
		BinaryTree<String> test = new BinaryTree<String>();
		
		testGetRootData(test,null);
		testIsEmpty(test,true);
		
		testSetTree(test,"test");
		testIsEmpty(test,false);
		testGetRootData(test,"test");
		testGetRootNode(test,new BinaryNode<String>("test"));
		testGetHeight(test,1);
		testGetNumberOfNodes(test,1);
		
		BinaryTree<String> leftTree = new BinaryTree<String>("left1");
		testIsEmpty(leftTree,false);
		testGetRootData(leftTree,"left1");
		testGetHeight(leftTree,1);
		BinaryTree<String> rightTree = new BinaryTree<String>("right1");
		
		testSetTree(test,test.getRootData(),leftTree,rightTree);
		testIsEmpty(test,false);
		testGetRootData(test,"test");
		testGetRootNode(leftTree,new BinaryNode<String>("left1"));
		testGetHeight(test,2);
		testGetNumberOfNodes(test,3);
		
		BinaryTree<String> test2 = new BinaryTree<String>("test2");
		BinaryNode<String> node1 = new BinaryNode<String>("left2");
		BinaryNode<String> node2 = new BinaryNode<String>("right2");
		test2.getRootNode().setLeftChild(node1);
		test2.getRootNode().setRightChild(node2);
		
		testIsEmpty(test2,false);
		testGetNumberOfNodes(test2,3);
		testGetHeight(test2,2);
		testGetRootData(test2,"test2");
		testClear(test2);
	}
	
	public static void testGetRootData(BinaryTreeInterface<String> binaryTree, String correct)
	{
		System.out.println("Testing getRootData method: ");
		
		String result = binaryTree.getRootData();
		
		System.out.print("getRootData returns "+result+": ");
		if(result==correct){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testGetRootNode(BinaryTreeInterface<String> binaryTree, BinaryNodeInterface<String> correct)
	{
		System.out.println("Testing getRootNode method: ");
		
		BinaryNode<String> result = (BinaryNode<String>)((BinaryTree<String>)binaryTree).getRootNode();
		
		System.out.print("Testing if node is correct ... ");
		if(result.equals(correct)){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testGetHeight(BinaryTreeInterface<String> binaryTree, int correct)
	{
		System.out.println("Testing getHeight method: ");
		
		int result = binaryTree.getHeight();
		
		System.out.print("getHeight returns "+result+": ");
		if(result==correct){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testGetNumberOfNodes(BinaryTreeInterface<String> binaryTree, int correct)
	{
		System.out.println("Testing getNumberOfNodes method: ");
		
		int result = binaryTree.getNumberOfNodes();
		
		System.out.print("getNumberOfNodes returns "+result+": ");
		if(result==correct){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testIsEmpty(BinaryTreeInterface<String> binaryTree, boolean correct)
	{
		System.out.print("Testing isEmpty method with ");
		if(correct){
			System.out.println("an empty binary tree: ");
		}else{
			System.out.println("a non-empty binary tree: ");
		}
		
		System.out.print("isEmpty returns "+binaryTree.isEmpty()+": ");
		if(binaryTree.isEmpty()==correct){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testClear(BinaryTreeInterface<String> binaryTree)
	{
		System.out.println("Testing clear method: ");
		
		System.out.print("Clearing ... ");
		binaryTree.clear();
		if(binaryTree.isEmpty()){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testSetTree(BinaryTreeInterface<String> binaryTree, String rootData)
	{
		System.out.println("Testing setTree method: ");
		
		System.out.print("Setting rootData ... ");
		binaryTree.setTree(rootData);
		
		if(binaryTree.getRootData()==rootData){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
	
	public static void testSetTree(BinaryTreeInterface<String> binaryTree, String rootData,
			BinaryTreeInterface<String> leftTree, BinaryTreeInterface<String> rightTree)
	{
		System.out.println("Testing setTree method: ");
		
		System.out.print("Setting tree ... ");
		binaryTree.setTree(rootData,leftTree,rightTree);
		
		if(binaryTree.getRootData()==rootData){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		System.out.println();
	}
}
