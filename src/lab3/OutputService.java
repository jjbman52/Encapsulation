package lab3;

public class OutputService {
    
    private Employee employee;
    
    public OutputService(Employee employee){
        this.employee = employee;
    }
    
    public void doOutput(String msg) {
        System.out.println(msg);
    }
}
