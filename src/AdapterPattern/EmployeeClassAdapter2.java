package AdapterPattern;

public class EmployeeClassAdapter2 implements CustomerName{
    private Employee employee;

    EmployeeClassAdapter2(Employee e){
        this.employee=e;

    }
    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }
}
