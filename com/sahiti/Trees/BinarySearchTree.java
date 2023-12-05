package com.sahiti.Trees;

public class BinarySearchTree {

    Node root;

    public static void main(String[] args)
    {
        Node rootnode = new Node(2);

        BinarySearchTree bst = new BinarySearchTree();

        bst.root = rootnode;
        bst.insert(10);
        bst.insert(30);
        bst.insert(15);
        bst.insert(45);
        bst.traversal();
        System.out.println(bst.search(15));
    }
    public void insert(int data)
    {
        insert(this.root, data);
    }
    public Node insert(Node root, int data)
    {
        if(root == null)
        {
            root = new Node(data);
        }
        else if(data < root.data)
        {
            root.left = insert(root.left, data);
        }
        else if(data>root.data)
        {
            root.right = insert(root.right,data);
        }
        return root;
    }

    public void traversal()
    {
        traversal(root);
    }
    public void traversal(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.data);
            traversal(root.left);
            traversal(root.right);
        }
    }

    public boolean search(int value) // redo
    {
        return search(this.root, value);
    }
    public boolean search(Node root, int value)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data > value)
        {
            return search(root.right, value);
        }
        if(root.data < value)
        {
            return search(root.left, value);
        }
        return true;
    }

}
