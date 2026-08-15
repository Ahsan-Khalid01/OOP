

public abstract class Employe {
    private  int empid;
    private String empname;
    public Employe(int i,String n)
    {
        this.empid=i;
        this.empname=n;

    }
    public abstract void earning();
    @Override
    public String toString()
    {
    return String.format("Employe Name  : %s\n Employe ID : %S",this.empname,this.empid);
    }


}
