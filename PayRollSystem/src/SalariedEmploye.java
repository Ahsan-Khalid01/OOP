public class  SalariedEmploye extends Employe {
    private double weeklysal;
    public SalariedEmploye(int i,String n,double  w)
    {
        super(i, n);
        this.weeklysal=w;
    }
    @Override
    public void earning()
    {
        System.out.println("weekly Salary : "+this.weeklysal);

    }
    @Override
    public String toString()
    {
        return String.format("%s \n Weekly Salary : %s ",super.toString(),this.weeklysal);
    }

}
