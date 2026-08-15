public class Account {

    private int Accno;
    private  double accbal;
    public Account(int n,double  b)
    {
        this.Accno=n;
        this.accbal=b;
    }
    public int getAccNO()
    {
        return this.Accno;
    }
    public double getAccBal()
    {
        return  this.accbal;
    }
    public void display()
    {
        System.out.println("---------------------------");
        System.out.println("Account Number : "+this.Accno+"\nAccount Balance  : "+this.accbal);
    }
    
}
