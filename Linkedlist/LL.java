package linkedlistex;

/**
 *
 * @author USER
 */
public class LL {
    private Node firstNode;
    private Node lastNode;
    private Node currentNode;
    int num;
    
    public LL(){
        firstNode = null;
        lastNode = null;
        currentNode = null;
        num = 0;
    }
    
    public LL(int a){
        firstNode = null;
        lastNode = null;
        currentNode = null;
        num = a;
    }
    
    public boolean isEmpty(){
        return(firstNode == null);
    }
    
    public void insertAtFront(Object num){
        if(isEmpty()){
            firstNode = lastNode = new Node (num);
        }
        else{
            firstNode = new Node(num, firstNode);
        }
    }
    
    public void insertAtBack(Object num){
        if(isEmpty()){
            firstNode = lastNode = new Node (num);
        }
        else{
            lastNode.next = new Node(num);
            lastNode = lastNode.next;
        }
        lastNode.next = null;
    }
    
     public void insertAtmiddleBack(){
         if(lastNode == null){
         return;
         }
         Node n = lastNode;
         while(n!=null && n.next != null){
         n.next = n;
         n = n.next;
         }
    }
    public static class EmptyListException extends Exception{
        public EmptyListException(int num){
            System.out.println("The List is Empty");
        }
    }
    
    public Object removeFromFront() throws EmptyListException{
        Object removeItem = null;
        if(isEmpty()){
            throw new EmptyListException(num);
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
    
    public Object removeFromBack() throws EmptyListException{
        Object removeItem = null;
        if(isEmpty()){
            throw new EmptyListException(num);
        }
        removeItem = lastNode.data;
        
        if(firstNode.equals(lastNode)){
            firstNode = lastNode = null;
        }
        else{
            Node current = firstNode;
            while(current.next != lastNode){
                current = current.next;
            }
            lastNode = current;
            current.next = null;
        }
        return removeItem;
    }
    
    public Object removeFromSecond() throws EmptyListException{
        Object removeItem ;
        
        if(firstNode.next == null || firstNode == null){
           removeItem= null;
        }
        else{
            currentNode = firstNode.next;
            removeItem = currentNode.data;
            firstNode.next = currentNode.next;
        }
        return removeItem;
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
     public Object getNext()
    {
        if(isEmpty())
        {
           return null; 
        }
        else 
        {
           firstNode= firstNode.next;
           return firstNode.data;
        }
    }
    
    public String display(){
        if(isEmpty()){
            System.out.println("List is empty");
        }
        else{
            Node current = firstNode;
            while(current != null){
                System.out.print(current.data+"->");
                current = current.next;
            }
        }
    return null; 
    }
}
