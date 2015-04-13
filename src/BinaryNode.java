
public class BinaryNode<E> implements BinaryNodeInterface<E>
{
	private E data;
	private BinaryNode<E> left;
	private BinaryNode<E> right;
	
	public BinaryNode()
	{
		this(null);
	}
	
	public BinaryNode(E dataPortion)
	{
		this(dataPortion, null, null);
	}
	
	public BinaryNode(E dataPortion, BinaryNode<E> leftChild, BinaryNode<E> rightChild)
	{
		data = dataPortion;
		left = leftChild;
		right = rightChild;
	}
	
	public E getData()
	{
		return data;
	}

	public void setData(E newData)
	{
		data = newData;
	}

	public BinaryNodeInterface<E> getLeftChild()
	{
		return left;
	}

	public BinaryNodeInterface<E> getRightChild()
	{
		return right;
	}

	
	public void setLeftChild(BinaryNodeInterface<E> leftChild)
	{
		left = (BinaryNode<E>)leftChild;
	}

	public void setRightChild(BinaryNodeInterface<E> rightChild)
	{
		right = (BinaryNode<E>)rightChild;
	}

	public boolean hasLeftChild()
	{
		return left != null;
	}

	public boolean hasRightChild()
	{
		return right != null;
	}

	public boolean isLeaf()
	{
		return (left == null) && (right == null);
	}

	public int getNumberOfNodes()
	{
		int leftNumber = 0;
		int rightNumber = 0;
		
		if(left != null){
			leftNumber = left.getNumberOfNodes();
		}
		
		if(right != null){
			rightNumber = right.getNumberOfNodes();
		}
		
		return 1 + leftNumber + rightNumber;
	}

	public int getHeight()
	{
		return getHeight(this);
	}
	
	private int getHeight(BinaryNode<E> node)
	{
		int height = 0;
		
		if(node != null){
			height = 1+Math.max(getHeight(node.left), getHeight(node.right));
		}
		
		return height;
	}

	public BinaryNodeInterface<E> copy()
	{
		BinaryNode<E> newRoot = new BinaryNode<E>(data);
		
		if(left != null){
			newRoot.left = (BinaryNode<E>)left.copy();
		}
		
		if(right != null){
			newRoot.right = (BinaryNode<E>)right.copy();
		}
		
		return newRoot;
	}
	
	public boolean equals(BinaryNodeInterface<E> node)
	{	
		if(data.equals(node.getData())){
			if(left != null){
				left.equals(((BinaryNode<E>)node).getLeftChild());
			}
			
			if(right != null){
				right.equals(((BinaryNode<E>)node).getRightChild());
			}
			
			return true;
		}
		
		return false;
	}
}
