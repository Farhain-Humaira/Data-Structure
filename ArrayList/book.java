import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
class book {
    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<String>();
        
        bookList.add("Lord of The Ring");
        bookList.add("Doraemon");
        bookList.add("The Amazing Spiderman");
        bookList.add("Dora the Explorer");
        bookList.add("Mari Memasak");
        
        System.out.println(bookList);
        
        bookList.set(1,"Jom Sihat");
        
        System.out.println();
        
    }
    
}
