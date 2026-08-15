public class HourlyEmployes extends Employe{
    private int totalhour;
    private  double  rateperhour;
    public HourlyEmployes(int i,String n,int t,double  r)
    {
        super(i, n);
        this.totalhour=t;
        this.rateperhour=r;
    }
    @Override
    public void earning()
    {
        if(this.totalhour<=40)
        {
            System.out.println("Total Earning :"+this.rateperhour*this.totalhour);
        }
        else
            if(this.totalhour>40)
            {
                System.out.println("Total Earning  : "+(this.rateperhour*40)+(this.totalhour-40)*(this.totalhour*1.5));
            }
    }
    @Override
    public String toString()
    {
        return String.format("%S \n Total work Hour : %d \n Rate Per Hour : %f",super.toString(),this.totalhour,this.rateperhour);
    }
    }


