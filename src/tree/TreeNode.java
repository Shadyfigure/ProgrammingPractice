package tree;

import java.util.ArrayList;

public class TreeNode<T> 
{
	private T data;
	public ArrayList<TreeNode> children;
	
	public TreeNode(T val)
	{
		data = val;
		children = new ArrayList<TreeNode>();
	}

	public T getData() 
	{
		return data;
	}
}
