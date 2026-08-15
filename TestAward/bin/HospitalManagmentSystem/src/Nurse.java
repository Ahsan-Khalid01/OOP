
import java.util.Scanner;
public class Nurse extends HospitalStaff {
    private int criticalShiftHandled;
    private  double effiencyRate;
    static int count=1;
    public Nurse()
    {

    }
    public Nurse(String name,String Dept,int cshft,double effrate)
    {
        super(name, Dept);
        this.criticalShiftHandled=cshft;
        this.effiencyRate=effrate;
    }
    @Override
    public void inputData()
    {
        Scanner o=new Scanner(System.in);
        System.out.println("=============: Input Nurse information :=============\n");
        System.out.println("Enter The Name of Nurse :   "+count);
        String nm=o.nextLine();
        super.setName(nm);
        System.out.println("Enter Department Name");
        String dp=o.nextLine();
        super.SetDeparment(dp);
        System.out.println("Enter The Total Critcal Shifts Handled");
        this.criticalShiftHandled=o.nextInt();
        System.out.println("Enter the Total Efficiency Rating");
        this.effiencyRate=o.nextDouble();
        count++;
    }
    @Override
    public void isExceptional()
    {
        if(this.criticalShiftHandled>=30 && this.effiencyRate>=90)
        {
            System.out.println("\n===========: Exceptional Nurse :===========");
            System.out.printf("\nNurse Name : %s  \nDepartment : %s \n Total Critical Shifts Handled  : %d  \nTotal Efficiency Rating  :  %f\n",super.getName(),super.getDepartment(),this.criticalShiftHandled,this.effiencyRate);
        
        }
    }
    @Override
    public void displayData()
    {
        System.out.println("\n============: Nurse Information :============");
        System.out.println();
        System.out.printf("\nNurse Name : %s  \nDepartment : %s \n Total Critical Shifts Handled  : %d  \nTotal Efficiency Rating  :  %f\n",super.getName(),super.getDepartment(),this.criticalShiftHandled,this.effiencyRate);
    }
    @Override
    public String toString()
    {
        return String.format("\nNurse Name : %s  \nDepartment : %s \n Total Critical Shifts Handled  : %d  \nTotal Efficiency Rating  :  %f\n",super.getName(),super.getDepartment(),this.criticalShiftHandled,this.effiencyRate);
    }

}
