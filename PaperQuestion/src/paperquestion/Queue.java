/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package paperquestion;

/**
 *
 * @author Ahsan Khalid
 */
public class Queue 
{
    
     int Que[]={10,20,30,40,50};
     int temp[]=new int[Que.length] ;
     
     int  front=0;
     int rear =Que.length-1;
     int k=3;
     
     
           
       
       public void Deque()
       {
         // int temp[]=new int[Que.length] ;
          for(int i=0;i<k;i++)
          {
              temp[i]=Que[front];
              front++;
          }
       
       }
       public void EnQue()
       {
           for(int i=front;i>=0;i--)
           {
               front--;
               Que[front]=temp[i];
           }
       }
       
       public void display()
       {
           for(int i=front;i<=rear;i++)
           {
               System.out.printf(" [ %d ]",Que[i]);
           }
       }
           
    

}
