package Std;

/**
 *
 * @author ACER SWIFT 3X
 */
public class Student {
    private String name;
    private String matric;
    private String gender;
    private double cgpa;
    
    public Student(String n, String m, String g, double c)
    {
        this.name = n;
        this.matric = m;
        this.gender = g;
        this.cgpa = c;
    }
    
    public String getName()
    {
        return name;
    }
    public String getMatric()
    {
        return matric;
    }
    public String getGender()
    {
        return gender;
    }
    public double getCGPA()
    {
        return cgpa;
    }
    
    public String toString()
    {
        return("Student Name: "+name+"\nMatric No: "+matric+"\nGender: "+gender+"\nCGPA: "+cgpa);
    }
}
