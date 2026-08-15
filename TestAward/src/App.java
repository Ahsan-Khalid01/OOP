
//import javax.sound.sampled.SourceDataLine;
//import javax.swing.JOptionPane;
import java.util.Scanner;
//import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
       person []p=new person[10];
       for(int i=0;i<=8;i+=2)
       {
         p[i]=new Professor();
         p[i].inputData();
       }
       int e=1;
       while(e<=9)
       {
        p[e]=new Student();
        p[e].inputData();
        e+=2;
       }
       //for(int i=1; i<p.length-1;i+=2);
       //{
        //p[i]=new Student();
       //}
       /*for(int k=0;k<=10;k+=2)
       {
        p[k].inputData();
        //System.out.print(k);
        //p[k].isOutstanding();
       }
       for(int l=1;l<=9;l+=2)
       {
        p[l].inputData();
       }*/
      while (true) {
       int op;
       
       System.out.println("Press 1 > Show All Information  \nPress 2 > Show OutStanding Information");
       Scanner ab=new Scanner(System.in);
       op=ab.nextInt();
      for (int idx = 0; idx < 10; idx++)
      {
        switch (op) {
            case 1:{
        //for (int idx = 0; idx < 10; idx++)
         System.out.print(p[idx]);
        break;
       }
      case 2:
      {
        p[idx].isOutstanding();
        break;

      }
      default:{ 
        System.out.println("Invalid INput");
       }
      }
      /*if(op!=1 ||op!=2)
      {
        System.out.println("Invalid INput");
        //JOptionPane.showMessageDialog(null, "Invalid Input", "University Managment System", JOptionPane.WARNING_MESSAGE);
      }*/
       }
             }
            
                   /*  Professor o=new Professor();
        o.inputData();
        Student o1=new Student();
        o1.inputData();*/
    
    }
  }

