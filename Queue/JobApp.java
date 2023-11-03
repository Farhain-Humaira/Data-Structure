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
import java.util.*;
public class JobApp {
    public static void main(String[] args)throws job.LinkedList.EmptyListException{
        
        Scanner input = new Scanner(System.in);
        Queue jobQueue = new Queue();
        
        for(int i=0; i<3; i++){
            System.out.print("Product ID: ");
            int id = input.nextInt();
            
            System.out.print("Product Name: ");
            String name = input.next();
            
            System.out.print("Number of Units");
            int num = input.nextInt();
            
            Job j = new Job(id, name, num);
            jobQueue.enqueue(j);
        }
        
        System.out.println("Enter job quota for one cycle: ");
        int quotaPerCycle = input.nextInt();
        
        int cycle = 1;
        int total = 0;
        while (!jobQueue.isEmpty())
        {
            Job job = (Job)jobQueue.dequeue();
            System.out.println("Cycle"+cycle);
            System.out.println("Product Id:"+job.getId()+"Name:"+job.getName());

            if(job.getNumUnits()<=quotaPerCycle)   
            {
                System.out.println("Data processed: "+job.getNumUnits());
                System.out.println("Job Complete");
                total += job.getNumUnits();
            }
            else
            {
                int dataLeft = job.getNumUnits()-quotaPerCycle;

                System.out.println("Dataprocessed: " + quotaPerCycle +",DataLeft: "+dataLeft);
                job.setNumUnits(dataLeft);
                jobQueue.enqueue(job);

                total += quotaPerCycle;
            }
            cycle++;
        }   
        System.out.println("Total processed"+total);
    }
}
