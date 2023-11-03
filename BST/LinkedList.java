/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

public class LinkedList {
    private Node root;
    
    public LinkedList(){
        root = null;
    }
    //delete a node from BST
    public void deleteKey(int key) { 
        root = delete_Recursive(root, key); 
    } 
   
    //recursive delete function
    public Node delete_Recursive(Node root, int key)  { 
        //tree is empty
        if (root == null)  
            return root; 
   
        //traverse the tree
        if (key < root.key)     //traverse left subtree 
            root.left = delete_Recursive(root.left, key); 
        else if (key > root.key)  //traverse right subtree
            root.right = delete_Recursive(root.right, key); 
        else  { 
            // node contains only one child
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
   
            // node has two children; 
            //get inorder successor (min value in the right subtree) 
            root.key = minValue(root.right); 
   
            // Delete the inorder successor 
            root.right = delete_Recursive(root.right, root.key); 
        } 
        return root; 
    } 
   
    public int minValue(Node root)  { 
        //initially minval = root
        int minval = root.key; 
        //find minval
        while (root.left != null)  { 
            minval = root.left.key; 
            root = root.left; 
        } 
        return minval; 
    } 
   
    // insert a node in BST 
    public void insert(int key)  { 
        root = insert_Recursive(root, key); 
    } 
   
    //recursive insert function
    public Node insert_Recursive(Node root, int key) { 
          //tree is empty
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        //traverse the tree
        if (key < root.key)     //insert in the left subtree
            root.left = insert_Recursive(root.left, key); 
        else if (key > root.key)    //insert in the right subtree
            root.right = insert_Recursive(root.right, key); 
          // return pointer
        return root; 
    }
    
    public void inorder() { 
        inorder_Recursive(root); 
    } 
   
    // recursively traverse the BST  
    public void inorder_Recursive(Node root) { 
        if (root != null) { 
            inorder_Recursive(root.left); 
            System.out.print(root.key + " "); 
            inorder_Recursive(root.right); 
        } 
    } 
    
    public void postorder(){
        postorder_Recursive(root);
    }
    
    public void postorder_Recursive(Node root){
        
        if(root !=null){
            postorder_Recursive(root.left);
            postorder_Recursive(root.right);
            System.out.print(root.key + " ");
        }
    }
    
    public void preorder(){
        preorder_Recursive(root);
    }
    
    public void preorder_Recursive(Node root){
        if(root!=null){
            System.out.print(root.key + " ");
            preorder_Recursive(root.left);
            preorder_Recursive(root.right);
        }
    }
}
