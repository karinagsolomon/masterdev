package inheritance;

public class Employee extends Person{
    private String employeeId;
    private String title;

    public Employee(){
        super("Karina");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(String id){
        this.employeeId = id;
    }
}
