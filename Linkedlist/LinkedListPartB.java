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
public class LinkedListPartB {
     public static void main(String[] args) throws LL.EmptyListException
    {
        LL objList = new LL();
        
        objList.insertAtBack(10);
        objList.insertAtBack(20);
        objList.insertAtBack(30);
        objList.insertAtBack(40);
        objList.insertAtBack(50);
        
        objList.removeFromSecond();
              
        System.out.println(objList.display());
        
        
        
        
    }
    
}
