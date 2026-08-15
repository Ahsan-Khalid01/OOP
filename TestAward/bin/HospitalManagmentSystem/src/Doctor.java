import java.util.Scanner;
public class Doctor extends HospitalStaff{
    private int successfulSurgeries;
    private double satisfactionScore;
    static int count=1;
    public Doctor()
    {

    }
    public Doctor(String n,String d,int ssurg,double sscor)
    {
        super(n, d);
        this.successfulSurgeries=ssurg;
        this.satisfactionScore=sscor;
    }
    @Override
    public void inputData()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Name of Doctor :  "+count);
        String name=in.nextLine();
        super.setName(name);
        System.out.println("Enter The Deparment Name :");
        String Depart=in.nextLine();
        super.SetDeparment(Depart);
        System.out.println("Enter the Total  Number of SuccessFull Surgeries :");
        this.successfulSurgeries=in.nextInt();
        System.out.println("Enter the Total Patient Satisfaction Score ");
        this.satisfactionScore=in.nextDouble();
        count++;

    }
    @Override
    public void displayData()
    {
        System.out.println("\n======== : Doctor Information : ========");
        System.out.printf("\nDoctor Name   :  %s\nDepartment   : %s\nSuccessFull Surgeries  :  %d\nPatient Satisfaction Score  :   %f\n",super.getName(),super.getDepartment(),this.successfulSurgeries,this.satisfactionScore);
    }
    @Override
    public void isExceptional()
    {
        
        if(this.successfulSurgeries>=50 && this.satisfactionScore>=4.5)
        {
            System.out.println(" ==========: Exceptional Doctor :==========");
            //this.displayData();
        System.out.printf("\nDoctor Name   :  %s\nDepartment   : %s\nSuccessFull Surgeries  :  %d\nPatient Satisfaction Score  :   %f\n",super.getName(),super.getDepartment(),this.successfulSurgeries,this.satisfactionScore);
    }

        }
    
    @Override
    public String toString()
    {
        return String.format("\nDoctor Name  : %S\n Department : %s \n Successfull Surgeries : %d \n Patient Satisfaction Score  : %f\n",super.getName(),super.getDepartment(),this.successfulSurgeries,this.satisfactionScore);
    }
}
