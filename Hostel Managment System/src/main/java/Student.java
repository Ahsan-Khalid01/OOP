public class Student {
    private String name, regNo, department, contact;
    
    public Student(String name, String regNo, String department, String contact){
        this.name = name;
        this.regNo = regNo;
        this.department = department;
        this.contact = contact;
    }
    
    public String getName(){ return name; }
    public String getRegNo(){ return regNo; }
    public String getDepartment(){ return department; }
    public String getContact(){ return contact; }
}
