/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package guesssgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ahsan Khalid
 */
public class GuesssGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         while(true){
     int wincount=0;
     
        Scanner in=new Scanner(System.in);
        System.out.println("\n----: Guess The number 1 to 5 :----\n\n=========: Game Start :=========");
        for (int i=0;i<10;i++)
        {

        
        Random rd=new Random();
        int num=rd.nextInt(5);
        System.out.println("\nGuess the Number......");
        System.out.println();
        int input =in.nextInt();
        if(num == input)
        {
        System.out.println("Matched\n");
        wincount++;
        }else{
        System.out.println("Not Match\n");
        }
    }
          System.out.println("Game Over");
        if(wincount>5)
        {
            System.out.println("=====================");
        System.out.println("user WIn");
          System.out.println("=====================");
        }else
            if(wincount == 5)
            {
                  System.out.println("=====================");
            System.out.println("Match Draw");
              System.out.println("=====================");
            }
        else if(wincount<5)
        {
              System.out.println("=====================");
        System.out.println("Computer Win");
          System.out.println("=====================");
        }
       
        
        System.out.println("1 > Restart\n2 > Exit\n");
        int op=in.nextInt();
        if(op == 1)
        {
          continue;
        }
        else if(op ==2)
        {
          break;
        }else{
          System.out.println("Invalied input");
        }
        

    }

    }

}
