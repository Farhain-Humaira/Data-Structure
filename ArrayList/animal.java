package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListApp{

    
    public static void main(String[] args) {
         ArrayList<String> aniList = new ArrayList<String>();
         
        aniList.add("Rabit");
        aniList.add("Horse");
        aniList.add("Cow");
        aniList.add("Duck");
        aniList.add("Swan");
        aniList.add("Kangaroo");
        aniList.add("Worm");
        aniList.add("Zebra");
          
                
        aniList.add(3,"Hamster");
        aniList.remove("Swan");
         aniList.add("Cow");
      
    System.out.println(aniList);
    
    aniList.set(4, "Bird");
    
    System.out.println(aniList);
    }
    
}
