
package binarytree;

/**
 *
 * @author ComputerArtt
 */
public class BinaryTreeTest {

    public static void main(String[] args) {
        
        BinaryTree BTree = new BinaryTree();
        //create root of BTree
        BTree.root = new Node(1);
         /* following is the tree after above statement 
  
                    1 
                  /   \ 
                null  null     
        */
         BTree.root.left = new Node(2);
         BTree.root.right = new Node(3);
         /* 2 and 3 become left and right children of 1 
                    1 
                  /   \ 
                 2      3 
               /    \    /  \ 
             null null null null  
         */
         BTree.root.left.left = new Node(4);
         BTree.root.left.right = new Node(5);
         /* 2 and 3 become left and right children of 1 
                    1 
                  /   \ 
                 2      3 
               /  \    /  \ 
              4    5  null null  
         */
         //Traversal of Binary Tree.There is tree different way to traversal
         //in hier Preorder way(Root->Left->Right)
         BTree.root.left.left.left = new Node(10);
         BTree.PreOrderTraversal();
    }
    
}

class Node
{
    int key;
    Node left, right;
    
    public Node(int value)
    {
        key = value;
        left = right = null;
    }
}
//create binayr tree in Java
class BinaryTree
{
    Node root;//Binary Tree's root(Node)
    
    public BinaryTree()
    {
        root = null;
    }
            
    public BinaryTree(int key)
    {
        root = new Node(key);
    }
    
    void PreOrderTraversal(Node node)
    {
        if(node == null)
            return;
        
        System.out.print(node.key + "-");//firstly print data of node
        
        PreOrderTraversal(node.left);//then recur on left subtree
        PreOrderTraversal(node.right);//then after recur on right subtree
    }
    void PreOrderTraversal()
    {
        PreOrderTraversal(root);
    }
}
