package binarysearchtree;

import java.util.*;
public class BinarySearchTree {

    public static void main(String[] args) {
        //create a BST object
        LinkedList bst = new LinkedList(); 
        /* BST tree 
              60 
            /    \ 
          50      70 
         /  \       \   
        30  58       80
          \         /
           46      77  */
        
        //insert data into BST
        bst.insert(60); 
        bst.insert(50); 
        bst.insert(70); 
        bst.insert(30); 
        bst.insert(58); 
        bst.insert(46);
        bst.insert(80); 
        bst.insert(77); 
        
        //print the BST inorder
        System.out.println("The BST for inorder:"); 
        bst.inorder(); 
        
        //print the BST preorder
        System.out.println("\n\nThe BST for preorder:"); 
        bst.preorder();
        
        //print the BST postorder
        System.out.println("\n\nThe BST for postorder:"); 
        bst.postorder();
        
        //Inorder traversal of the modified tree after delete node 60. 
        System.out.println("\n\nThe BST after Delete 60:"); 
        bst.deleteKey(60); 
        bst.inorder(); 
        
        //Inorder traversal of the modified tree after inserting node 72.
        bst.insert(72);
        System.out.println("\n\nAfter inserting node 72:");
        bst.inorder();
     } 
}
