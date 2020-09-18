
public class BinaryTree {

	//Basic node class with value, left and right node.
	public class Node
	{
		public int value = 0;
		public Node left = null;
		public Node right = null;
		
		//Parameterized constructor
		public Node(int value)
		{
			this.value= value;
			this.left = null;
			this.right = null;
		}
	}
	
	//Binary tree always begin with a root node
	private Node root = null;
	
	//To insert node recursively
	public void insertNode(int value)
	{
		//if root is empty, create new node
		if(root == null)
		{
			root = new Node(value);
		}
		else
		{
			insertNode(value,root);
		}
	}
	
	
	//Cannot have duplicated value
	private void insertNode(int value, Node node)
	{
		//If value is less then the current node, traverse to the left
		if(value < node.value)
		{
			//if node is null, create new node,return
			if(node.left == null)
				node.left = new Node(value);
			else
				insertNode(value,node.left);
		}
		//If value is more then the current node, traverse to the right
		else if(value > node.value)
		{
			//if node is null, create new node,return
			if(node.right == null)
				node.right = new Node(value);
			else
				insertNode(value,node.right);
		}
	}
	
	public void inOrder()
	{
		inOrder(root);
	}
	//LNR
	private void inOrder(Node node)
	{
		if(node == null)
			return;
		
		inOrder(node.left);
		System.out.print(node.value + " ");
		inOrder(node.right);
	}
	//NLR
	public void preOrder()
	{
		preOrder(root);
	}
	private void preOrder(Node node)
	{
		if(node == null)
			return;
		
		System.out.print(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	//LRN
	public void postOrder()
	{
		postOrder(root);
	}
	private void postOrder(Node node)
	{
		if(node == null)
			return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + " ");
	}

}
