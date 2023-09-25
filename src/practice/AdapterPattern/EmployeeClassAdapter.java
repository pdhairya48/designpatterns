package practice.AdapterPattern;

public class EmployeeClassAdapter extends Employee implements CustomerName{

    @Override public String getName() {
        return this.getFullName();
    }

    @Override public String getAddress() {
        return this.getOfficeLocation();
    }

    @Override public String getDesignation() {
        return this.getJobTitle();
    }
}
