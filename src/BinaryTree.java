import java.util.Iterator;


public class BinaryTree<E> implements BinaryTreeInterface<E>
{
	private BinaryNodeInterface<E> root;
	
	private void privateSetTree(E rootData, BinaryTree<E> leftTree, BinaryTree<E> rightTree)
	{
		root = new BinaryNode<E>(rootData);
		
		if((leftTree != null) && !leftTree.isEmpty()){
			root.setLeftChild(leftTree.root.copy());
		}
		
		if((rightTree != null) && !rightTree.isEmpty()){
			root.setRightChild(rightTree.root.copy());
		}
	}
	
	public BinaryTree()
	{
		root = null;
	}
	
	public BinaryTree(E rootData)
	{
		root = new BinaryNode<E>(rootData);
	}
	
	public BinaryTree(E rootData, BinaryTree<E> leftTree, BinaryTree<E> rightTree)
	{
		privateSetTree(rootData, leftTree, rightTree);
	}
	
	public E getRootData()
	{
		E rootData = null;
		
		if(root != null){
			rootData = root.getData();
		}
		
		return rootData;
	}
	
	protected void setRootData(E rootData)
	{
		root.setData(rootData);
	}
	
	protected void setRootNode(BinaryNodeInterface<E> rootNode)
	{
		root = rootNode;
	}
	
	protected BinaryNodeInterface<E> getRootNode()
	{
		return root;
	}

	public int getHeight()
	{
		return root.getHeight();
	}

	public int gerNumberOfNodes()
	{
		return root.getNumberOfNodes();
	}

	public boolean isEmpty()
	{
		return root == null;
	}

	public void clear()
	{
		root = null;
	}
	
	public void setTree(E rootData)
	{
		root = new BinaryNode<E>(rootData);
	}

	public void setTree(E rootData, BinaryTreeInterface<E> leftTree, BinaryTreeInterface<E> rightTree)
	{
		
	}
	

	public Iterator<E> getPreorderIterator()
	{
		
		return null;
	}

	public Iterator<E> getPostorderIterator()
	{
		
		return null;
	}

	public Iterator<E> getInorderIterator()
	{
		
		return null;
	}

	public Iterator<E> getLevelOrderIterator()
	{
		
		return null;
	}

}
