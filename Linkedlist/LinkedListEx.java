/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistex;

class LinkedListex{

    public static void main(String[] args) throws LL.EmptyListException
    {
        LL objList = new LL();
        
        int a = 10, b = 20, c = 30, d = 40;
        
        objList.insertAtBack(a);
        objList.insertAtBack(b);
        objList.insertAtBack(c);
        objList.insertAtBack(d);
        
        System.out.println("List number in linked list: ");
        System.out.println(objList.display());
        
        objList.insertAtFront(d);
        objList.insertAtFront(c);
        
        System.out.println("Current list number after insert at front is linked list: ");
        System.out.println(objList.display());
        
        objList.insertAtmiddleBack();
        
        System.out.println("Current list number after remove from back is linked list: ");
        System.out.println(objList.display());
        
        objList.removeFromFront();
        
        System.out.println("Current list number after from front is linked list: ");
        System.out.println(objList.display());
        
        objList.removeFromSecond();
        System.out.println(objList.display());
        
        
    }
}

