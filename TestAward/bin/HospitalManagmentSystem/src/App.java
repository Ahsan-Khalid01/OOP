
import java.util.Scanner;
//import javax.sound.sampled.SourceDataLine;
public class App {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        HospitalStaff []h=new HospitalStaff[10];
       /*  h[0]=new Doctor("Ahsan Khalid", "Cardiology", 143, 99.1);
        h[1]=new Doctor("Waleed Fiaz ", "Opthamologyy", 45, 67.2);
        
*/
for(int i=0;i<h.length;i+=2)
{
    h[i]=new Doctor();
    h[i].inputData();
}
for(int j=1;j<h.length;j+=2)
{
    h[j]=new Nurse();
    h[j].inputData();
}
while (true) {
    Scanner inp=new Scanner(System.in);
    for(int a=0;a<h.length;a++)
    {
    int op; 
    System.out.println("\nPress 1 For Display All Information\nPress 2 For Display Exceptional Details");
    op=inp.nextInt();
    switch (op) 
    {
        case 1:
            for(int e=0;e<h.length;e++)
            {
            System.out.print( h[e].toString());
            System.out.println("*****************************");
            }
            break;
        case 2:
            for(int y=0;y<h.length;y++)
            {
           h[y].isExceptional(); 
           System.out.println("*******************************");
            }
            break;
        default:
             throw new AssertionError();
        // System.out.println("Invalid Input");
            
            
    }
    
        
}
    
}
}
}

