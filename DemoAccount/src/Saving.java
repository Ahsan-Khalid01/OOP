

public class Saving extends Account {
    private double intrsrate;
    public Saving(int a,double b,double ir)
    {
        super(a,b);
        this.intrsrate=ir;

    }
    public double getIntresrate()

    {
        return this.intrsrate;

    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("IntresRate  : "+this.intrsrate);
    }
}
