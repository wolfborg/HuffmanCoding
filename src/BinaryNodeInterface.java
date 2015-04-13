
public interface BinaryNodeInterface<E>
{
	public E getData();
	public void setData(E newData);
	public BinaryNodeInterface<E> getLeftChild();
	public BinaryNodeInterface<E> getRightChild();
	public void setLeftChild(BinaryNodeInterface<E> leftChild);
	public void setRightChild(BinaryNodeInterface<E> rightChild);
	public boolean hasLeftChild();
	public boolean hasRightChild();
	public boolean isLeaf();
	public int getNumberOfNodes();
	public int getHeight();
	public BinaryNodeInterface<E> copy();
}
