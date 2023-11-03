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
public class Node {
    Job data;
    Node next;
    
    public Node(Job data) {
        this.data = data;
        this.next = null;
    }
    
    public Node(Job data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Job getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
