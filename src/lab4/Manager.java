package lab4;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Employee> employees;
    
    public Manager(){
        employees = new ArrayList();
    }
    
    public void hireNewEmployee(String firstName, String lastName, String ssn){
        Employee employee = new Employee(firstName, lastName, ssn);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setSsn(ssn);
        employees.add(employee);
        assignOrientationToEmployee(employee);
    }
    
    public void assignOrientationToEmployee(Employee employee){
        employee.doFirstTimeOrientation("A101");
    }
    
    public void outputReport(String ssn){
        Employee employee = null;
        
        for(Employee e : employees){
            if(e.getSsn().equals(ssn)){
                employee = e;
                break;
            } else {
                return;
            }    
        }
        
        if(employee.isMetWithHr() && employee.isMetDeptStaff()
                && employee.isReviewedDeptPolicies() && employee.isMovedIn()){
            
            employee.getReportService().outputReport();
        }
    }
    
    public List<Employee> getEmployees(){
        return employees;
    }
    
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
