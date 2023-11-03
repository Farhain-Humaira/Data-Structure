/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job;

/**
 *
 * @author USER
 */
public class LinkedList {
    private Node firstNode;
    private Node lastNode;
    private Node currentNode;
    Job data;
    
    public LinkedList(){
        firstNode = null;
        lastNode = null;
        currentNode = null;
        data = null;
    }
    
    public LinkedList(Job s){
        firstNode = null;
        lastNode = null;
        currentNode = null;
        data = s;
    }
    
    public boolean isEmpty(){
        return(firstNode == null);
    }
    
    public void insertAtBack(Job s){
        if(isEmpty()){
            firstNode = lastNode = new Node(s);
        }
        else{
            lastNode.next = new Node(s);
            lastNode = lastNode.next;
        }
    }
    
    public Object removeFromFront() throws EmptyListException{
        Job removeItem = null;
        
        if(isEmpty()){
            throw new EmptyListException(data);
        }
        removeItem = firstNode.data;
        
        if(firstNode.equals(lastNode)){
            firstNode = lastNode = null;
        }
        else{
            firstNode = firstNode.next;
        }
        return removeItem;
    }
    
    public static class EmptyListException extends Exception {

        public EmptyListException(Job data) {
            System.out.println("The list is empty");
        }
    }
    
    public Object getFirst(){
        if(isEmpty()){
            return null;
        }
        else{
            currentNode = firstNode;
            return currentNode.data;
        }
    }
    
    public Object getLast(){
        if(isEmpty()){
            return null;
        }
        else{
            currentNode = lastNode;
            return currentNode.data;
        }
    }
    
    public String toString(){
        return " " +data;
    }
}
