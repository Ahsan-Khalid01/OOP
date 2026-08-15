
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Student extends person{
    private double gpa;
    static  int count =1;
    @Override
    public  void inputData()
    {
        Scanner i=new Scanner(System.in);
        
      /*   System.out.println("=====================================================");
        System.out.println("      ------: Input Student Infromation :------   ");
        System.out.println("=====================================================");
       // System.out.println("----------------------------------------------");*/
        System.out.printf("Enter The Name of Student : %d\n",count);
        String n=i.nextLine();
        super.SetNAme(n );
        System.out.println("Enter the Gpa of Student  : ");
        this.gpa=i.nextDouble();
        System.out.println();
       // System.out.println("=====================================================");
        count++;



    }
   /*  public void inputData()
    {
       String name=JOptionPane.showInputDialog("Enter The Name of Student");
       super.SetNAme(name);
       String gpa=JOptionPane.showInputDialog("Enter The GPA of Student");
       double gp=Double.parseDouble(gpa);
       this.gpa=gp;

    }*/
    @Override
    public void isOutstanding()
    {
        if(this.gpa>3.5)
        {
            System.out.println("--------------------------------------------");
            System.out.println("---------: OutStanding Students  :--------");
            System.out.println("Student Name  : "+this.getNAme()+"\nGPA : "+this.gpa);
             System.out.println("--------------------------------------------");
        }
    }
    @Override
    public String toString()
    {
        return String.format("\nStudent Name  : %s \n  GPA   : %f " ,super.toString(),this.gpa);
    }
}
