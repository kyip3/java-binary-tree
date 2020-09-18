
public class Driver {

	public static void main(String[] args)
	{
		/* Let us create following BST 
		        50 
		     /     \ 
		    30      70 
		   /  \    /  \ 
		 20   40  60   80 */
		
		BinaryTree bTree = new BinaryTree();
		bTree.insertNode(50);
		bTree.insertNode(30);
		bTree.insertNode(20);
		bTree.insertNode(40);
		bTree.insertNode(70);
		bTree.insertNode(60);
		bTree.insertNode(80);

		//as what you have inserted accordingly
		//50 30 20 40 70 60 80 
		System.out.print("Preorder: ");
		bTree.preOrder();
		System.out.println();
		
		//will print by increasing order
		//20 30 40 50 60 70 80 
		System.out.print("Inorder: ");
		bTree.inOrder();
		System.out.println();
		
		//20 40 30 60 80 70 50 
		System.out.print("postorder: ");
		bTree.postOrder();
		
		
	}
}
