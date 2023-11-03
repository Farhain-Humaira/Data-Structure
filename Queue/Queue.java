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
public class Queue extends LinkedList{
    public Queue(){
    }
    
    public void enqueue(Job data){
        insertAtBack(data);
    }
    
    public Object dequeue() throws EmptyListException{
        return removeFromFront();
    }
    
    public Object getFront(){
        return getFirst();
    }
    
    public Object getEnd(){
        return getLast();
    }
}
