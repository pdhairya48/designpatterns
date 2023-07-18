package AdapterPattern;

public class Main {
    public static void main(String[] args) {

        //Using Class

        EmployeeClassAdapter employee=new EmployeeClassAdapter();
        populateEmployeeData(employee);
        BusinessCard businessCard=new BusinessCard();
        System.out.println(businessCard.designCard(employee));

        //Using Object

        Employee employee1=new Employee();
        populateEmployeeData2(employee1);
        EmployeeClassAdapter2 employeeClassAdapter = new EmployeeClassAdapter2(employee1);
        BusinessCard businessCard1=new BusinessCard();
        System.out.println(businessCard1.designCard(employeeClassAdapter));

    }
    private static void populateEmployeeData(Employee employee){
        employee.setFullName(" Dhairya ");
        employee.setOfficeLocation(" New York City ");
        employee.setJobTitle(" SDE-2 ");
    }
    private static void populateEmployeeData2(Employee employee){
        employee.setFullName(" Parekh ");
        employee.setOfficeLocation(" Wharton ");
        employee.setJobTitle(" SDE-2 ");
    }
}
