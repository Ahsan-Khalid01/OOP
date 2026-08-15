public class HospitalStaff implements Evaluable {
    private String name;
    private String department;
    public HospitalStaff()
    {

    }
    public HospitalStaff(String nm,String dp)
    {
        this.name=nm;
        this.department=dp;
    }
    public void  setName(String name)
    {
          this.name=name;
    }
    public void SetDeparment(String department)
    {
        this.department=department;
    }
    public String getName()
    {
        return this.name;
    }
    public String getDepartment()
    {
        return this.department;
    }
    public void inputData()
    {
    
    }
    public void displayData()
    {

    }
    @Override
    public void isExceptional()
    {

    }
    @Override
    public String toString()
    {
        return String.format("%s  : %S ",this.name,this.department);
    }
    

}
