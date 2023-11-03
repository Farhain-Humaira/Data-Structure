/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

public class Node {
    Node left;
    Node right;
    int key;

    public Node(int data) {
        key = data;
        left = right = null;
    }
}
