


public class BasePlusCommision extends commisionEmploye {
    private double basesalary;
    public BasePlusCommision(int a,String n,int t,double p,double bs)
    {
        super(a, n, t, p);
        this.basesalary=bs;
    }
    @Override
    public void earning()
    {
        System.out.println("Total Earning  : "+this.basesalary+(this.getPercentage()*this.getTotalSales()));
    }
    @Override
    public String toString()
    {
        return String.format("%S \n Base Salary  : %f",super.toString(),this.basesalary);
    }

}
