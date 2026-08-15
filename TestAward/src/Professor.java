import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Professor extends person {
    private int numPubs;
    static int count =1;
    @Override
public void inputData()
{
    
        Scanner in=new Scanner(System.in);
        
      /*   System.out.println("=====================================================");
        System.out.println("      ------: Input Professor Infromation :------   ");
        System.out.println("=====================================================");*/
        System.out.printf("Enter The NAme of professor %d: \n",count);
        String n=in.nextLine();
        super.SetNAme(n);
        System.out.println("Enter the  Number  of Paper Publish : ");
        this.numPubs=in.nextInt();
        count++;
         //System.out.println("=====================================================");
}


 @Override
    public void isOutstanding()
    {
        if(this.numPubs>20)
        {
            System.out.println("--------------------------------------------");
            System.out.println("---------: OutStanding Professor  :--------");
            System.out.println(" Name  : "+super.getNAme()+"\nNumber of Publish : "+this.numPubs);
             System.out.println("--------------------------------------------");
        }
    }
    @Override
    public String toString()
    {
        return String.format("\nProfessor Name  : %s   \nPublications  : %d \n" ,super.toString(),this.numPubs);
    }
    //@Override
   /*  public void inputData()
    {
        System.out.println("--------------------------------------------------");
        String nm=JOptionPane.showInputDialog("Enter the Name of Professor");
        super.SetNAme(nm);
        String a=JOptionPane.showInputDialog("Enter The Total Number of Publications of Professor  ");
        int n=Integer.parseInt(a);
        this.numPubs=n;
        
    }*/
}
