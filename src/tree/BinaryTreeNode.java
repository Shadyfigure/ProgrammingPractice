package tree;

public class BinaryTreeNode<T>
{
	private T data;
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	
	public BinaryTreeNode(T val)
	{
		this.data = val;
	}
	
	public T getData()
	{
		return this.data;
	}
}
