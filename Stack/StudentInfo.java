package Std;

/**
 *
 * @author ACER SWIFT 3X
 */
import java.util.*;
import java.util.Stack;
public class StudentInfo {
    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        // TODO code application logic here
        Stack stackAllStudent = new Stack();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of student: ");
        int no = sc.nextInt();
        
        for(int i=0; i<no; i++)
        {
            System.out.println("Enter the student name: ");
            String name = sc.next();
            System.out.println("Enter the student matric no: ");
            String matric = sc.next();
            System.out.println("Enter the student gender: ");
            String gender = sc.next();
            System.out.println("Enter the CGPA: ");
            double cgpa = sc.nextDouble();
            
            Student std = new Student(name, matric, gender, cgpa);
            stackAllStudent.push(std);
        }
        
        Stack stackExcelStd = new Stack();
        Stack stackWeakStd = new Stack();
        while(!stackAllStudent.isEmpty())
        {
            Student std2 = (Student)stackAllStudent.pop();
            if(std2.getCGPA() >= 3.0)
                stackExcelStd.push(std2);
            else
                stackWeakStd.push(std2);
        }
        
        while (!stackExcelStd.isEmpty())
        {
            stackExcelStd.pop();
        }
        while (!stackWeakStd.isEmpty())
        {
            stackWeakStd.pop();
        }
        
        //Display stackExcelStd
        while(!stackExcelStd.isEmpty())
        {
            Student std3 = (Student)stackExcelStd.pop();
            System.out.println(std3.toString());
        }
        //Display stackWeakStd
        while(!stackWeakStd.isEmpty())
        {
            Student std4 = (Student)stackWeakStd.pop();
            System.out.println(std4.toString());
        }
    }
    
}
