public class App {
    public static void main(String[] args)  {
       // System.out.println("Hello, World!");
    //SalariedEmploye e=new SalariedEmploye(12, "Ahsan", 5000);
    //System.out.println(e);
    Employe[]arr=new Employe[4];
    arr[0]=new HourlyEmployes(11, "Ahsan Khalid", 67, 300);
    arr[1]=new SalariedEmploye(12, "Hamza ", 12000);
    arr[2]=new commisionEmploye(14, "Waleed fiaz", 23000, 10);
    arr[3]=new BasePlusCommision(15, "Rehan khan ", 14000, 7, 30000);
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
       //System.out.println("Salary  :"+arr[i].earning());
        System.out.println("********************************");
        
     }
    }
    }

