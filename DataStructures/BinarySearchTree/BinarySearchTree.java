<<<<<<< HEAD

package binarysearchtree;

/**
 *
 * @author ComputerArtt, source:https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
 */
public class BinarySearchTree {
    
    class Node
    {
        int data;
        Node left, right;
        
        public Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    //Root
    Node root;

    public BinarySearchTree() 
    {
        root = null;
    }
    void insert(int data)
    {
        root = insert(root , data);
    }
    Node insert(Node root, int data)
    {
        //if tree is empty, create new node
        if(root == null)
        {
            root = new Node(data);
            return root;
        }
        //if tree is not empty
        if(data < root.data)
        {
            root.left = insert(root.left, data);
        }else if(data > root.data)
        {
            root.right = insert(root.right, data);
        }
        return root;
    }
    void inorder()
    {
        inorder(root);
    }
    void inorder(Node root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    //search an element in BST
    void search(int data)
    {
        root = search(root,data);
        if(root == null)
            System.out.println("not found...");
        else
            System.out.println("found: " + root.data);
    }
    public Node search(Node root, int data)
    {
        if(root == null || root.data == data)
           return root;
        if(root.data  > data)
            return search(root.left, data);
        return search(root.right, data);
        
    }

    public static void main(String[] args) {
        BinarySearchTree Btree = new BinarySearchTree();
        Btree.insert(50);
        Btree.insert(30);
        Btree.insert(20);
        Btree.insert(40);
        Btree.insert(70);
        Btree.insert(60);
        Btree.insert(80);
        Btree.inorder();
        Btree.search(70);
        Btree.search(100);
    }
    
}
=======

package binarysearchtree;

/**
 *
 * @author ComputerArtt, source:https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
 */
public class BinarySearchTree {
    
    class Node
    {
        int data;
        Node left, right;
        
        public Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    //Root
    Node root;

    public BinarySearchTree() 
    {
        root = null;
    }
    void insert(int data)
    {
        root = insert(root , data);
    }
    Node insert(Node root, int data)
    {
        //if tree is empty, create new node
        if(root == null)
        {
            root = new Node(data);
            return root;
        }
        //if tree is not empty
        if(data < root.data)
        {
            root.left = insert(root.left, data);
        }else if(data > root.data)
        {
            root.right = insert(root.right, data);
        }
        return root;
    }
    void inorder()
    {
        inorder(root);
    }
    void inorder(Node root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    //search an element in BST
    void search(int data)
    {
        root = search(root,data);
        if(root == null)
            System.out.println("not found...");
        else
            System.out.println("found: " + root.data);
    }
    public Node search(Node root, int data)
    {
        if(root == null || root.data == data)
           return root;
        if(root.data  > data)
            return search(root.left, data);
        return search(root.right, data);
        
    }

    public static void main(String[] args) {
        BinarySearchTree Btree = new BinarySearchTree();
        Btree.insert(50);
        Btree.insert(30);
        Btree.insert(20);
        Btree.insert(40);
        Btree.insert(70);
        Btree.insert(60);
        Btree.insert(80);
        Btree.inorder();
        Btree.search(70);
        Btree.search(100);
    }
    
}
>>>>>>> d47fbb1ad0f69b5708e947bd6439c259379a529d
