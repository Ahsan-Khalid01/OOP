/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package insertiontask;

import java.util.Scanner;

/**
 *
 * @author Ahsan Khalid
 */
public class workingClass {
    int arr[]=new int[5];
    
   public void Insertion()
   {
       Scanner input=new Scanner(System.in);
       for(int i=0;i<arr.length;i++)
       {
           System.out.println("Enter the Index  :  ");
           int index=input.nextInt();
           System.out.printf("\nEnter the Value of Index [%d] :  ",index);
           arr[index]=input.nextInt();
        
       }
       System.out.println("   --- :Orignal Array :---");
       System.out.println("===================================");
       
       for(int j=0;j<arr.length;j++)
       {
           System.out.printf("  %d  ",arr[j]);  
       }
       
        System.out.println("\n===================================");
         int delete;
         int des;
            System.out.println("Enter the index for Delete ");
       
          //  int delete;
           // System.out.println("Enter the index for Delete ");
            delete =input.nextInt();
            System.out.println("Enter new value");
            des=input.nextInt();
            arr[delete]=des;
        
       System.out.println("   --- :After Delete :---");
       System.out.println("===================================");
       for(int j=0;j<arr.length;j++)
       {
           System.out.printf("  %d  ",arr[j]);  
       }
       
        System.out.println("\n===================================");
            int newindex;
            int newvalue;
            System.out.println("Enter the new Index ");
            newindex=input.nextInt();
            System.out.printf("Enter the New index [%d] Value :  ",newindex);
            newvalue=input.nextInt();
          // int[] arr2=new int[arr.length +1];
                arr[newindex]=newvalue; 
                for(int j=newindex;j<arr.length;j++)
                {
                    arr[newindex +1]=arr[j];
                }
                
        System.out.println(" After shifting");
        for(int a=0;a<arr.length;a++)
        {
          //  System.out.println(" After shifting");
         System.out.printf("  %d  ",arr[a]);
            
        }
  
   }
}
