 class Node{
    int data;
    Node left;
    Node right;
    public Node(int item){
        data=item;
        left=right=null;
    }
}
public class BinarySearchTree {
    Node root;
    boolean isBST(){
        return isBSTUtil(root,Integer.MIN_VALUE ,Integer.MAX_VALUE);
    }
    boolean isBSTUtil(Node node, int min, int max){
        if (node==null){
            return true;
        }
        if (node.data<min || node.data>max){
            return false;
        }
        return(isBSTUtil(node.left, min, node.data-1) && isBSTUtil(node.right, node.data+1, max));
    }
    public static void main(String args[])
    {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        /*
              4
           /     \
          2      5
         /  \
       1     3
        */

        // tree.root = new Node(4);
        // tree.root.left = new Node(5);
        // tree.root.right = new Node(3);
        // tree.root.left.left = new Node(7);
        // tree.root.left.right = new Node(2);
        /*
              4
           /     \
          5      3
         /  \
       7     2
        */
        if (tree.isBST())
            System.out.println("Tree is Binary Search Tree");
        else
            System.out.println(" Tree is Not a Binary Search Tree");
    }
}
