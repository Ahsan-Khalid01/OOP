
public class commisionEmploye extends Employe{
    private int totalsales;
    private double percentage;
    public commisionEmploye(int i,String n,int ts,double p)
    {
        super(i, n);
        this.totalsales=ts;
        this.percentage=p;
    }
    public int getTotalSales()
    {
        return  this.totalsales;
    }
    public double getPercentage()
    {
        return this.percentage;
    }
@Override
public void earning()
{
    System.out.println("Total Earning : "+this.percentage*this.totalsales);
}
@Override
public String toString()
{
    return String.format("%S \n Total Sales  : %d  \n Percentage  : %f",super.toString(),this.totalsales,this.percentage);
}


}
