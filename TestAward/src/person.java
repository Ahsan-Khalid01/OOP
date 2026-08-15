public abstract class person implements Award {
    private String name;
    public person()
    {

    }
    public person(String n)
    {
        this.name=n;
    }
    public String getNAme()
    {
        return this.name;
    }
    public void SetNAme(String n)
    {
        this.name=n;
    }
    public void display()
    {
        System.out.println("Name  :"+this.name);
    }
    @Override
    public String toString()
    {
        return String.format(" %s\n",this.name);
    }
    public void inputData()
    {
    
    }

}
