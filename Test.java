import java.util.*;
class Node
{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
}
class BT
{
	Node root;
	BT()
	{
		root = null;
	}
	void inOrder(Node node)
	{
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}
	void preOrder(Node node)
	{
		if(node==null)
			return;
		System.out.print(node.data+" ");
		preOrder(node.left);		
		preOrder(node.right);
	}
	void postOrder(Node node)
	{
		if(node==null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+" ");
	}
	void levelOrder(Node node)
	{
		if(node==null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		q.add(null);
		while(!q.isEmpty()){
			Node currNode = q.remove();
			if(currNode == null){
				System.out.println();
				if(q.isEmpty())
					break;
				else
					q.add(null);
			}
			else{
				System.out.print(currNode.data+" ");
				if(currNode.left!=null)
					q.add(currNode.left);
				if(currNode.right!=null)
					q.add(currNode.right);
			}
		}
	}
	int countNodes(Node node)
	{
		if(node==null)
			return 0;
		int lc = countNodes(node.left);
		int rc = countNodes(node.right);
		return lc+rc+1;
	}
	int sumNodes(Node node)
	{
		if(node==null)
			return 0;
		int ls = sumNodes(node.left);
		int rs = sumNodes(node.right);
		return ls+rs+node.data;
	}
	int heightOfTree(Node node)
	{
		if(node==null)
			return 0;
		int lh = heightOfTree(node.left);
		int rh = heightOfTree(node.right);
		return Math.max(lh,rh)+1;
	}

	boolean search(Node node,int data)
	{
		if(node==null)
			return false;
		if(node.data==data)
			return true;
		if(search(node.left,data))
			return true;
		if(search(node.right,data))
			return true;
		return false;
	}
	
}
class Test
{
	public static void main(String[] args)
	{
		BT tree = new BT();
		tree.root = new Node(28);
		tree.root.left = new  Node(16);
        tree.root.left.left = new  Node(23);
		tree.root.left.right = new  Node(3);
        tree.root.left.right.left = new  Node(7);
        tree.root.left.right.right = new  Node(1);
        tree.root.left.right.left.left = new  Node(4);
        tree.root.left.right.left.right = new  Node(20);
        //tree.root.right.right = new  Node(12);
        // tree.root.right.right.left = new  Node(13);
        // tree.root.right.right.right = new  Node(5);
		tree.inOrder(tree.root);
		System.out.println();
		tree.preOrder(tree.root);
		System.out.println();
		tree.postOrder(tree.root);
		System.out.println();
		tree.levelOrder(tree.root);

		System.out.println("count of nodes: "+tree.countNodes(tree.root));
		 System.out.println("sum of nodes: "+tree.sumNodes(tree.root));
		 System.out.println("height of tree: "+tree.heightOfTree(tree.root));
		 System.out.println(tree.search(tree.root,1));//true
	}
}
