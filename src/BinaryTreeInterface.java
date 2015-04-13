
public interface BinaryTreeInterface<E> extends TreeInterface<E>
{
	public void setTree(E rootData);
	public void setTree(E rootData, BinaryTreeInterface<E> leftTree, BinaryTreeInterface<E> rightTree);
}
