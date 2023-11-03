/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistex;

/**
 *
 * @author USER
 */
class Node{
    
    Object data;
    Node next;
    
    public Node(Object item){
        data = item;
        next = null;
    }
    
    public Node(Object item, Node nextNode){
        data = item;
        next = nextNode;
    }
    
    public Object getData(){
        return data;
    }
    
    public Node getNext(){
        return next;
    }
}
