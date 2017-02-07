package lab4;

public class Company {
    private Manager manager;
    
    public Company(){
        manager = new Manager();
    }
    
    public void hireNewEmployee(String firstName, String lastName, String ssn){
        manager.hireNewEmployee(firstName, lastName, ssn);
        manager.outputReport(ssn);
    }
    
    public Manager getManager(){
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
