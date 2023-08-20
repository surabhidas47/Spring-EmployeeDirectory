package Service;

import Models.Employee;
import Repository.EmployeeRep;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {

    @Autowired
    private EmployeeRep employeeRep;

    public EmployeeService(EmployeeRep employeeRep) {
        this.employeeRep = employeeRep;
    }

    public Iterable<Employee> index() {
        return employeeRep.findAll();
    }

    public Employee create(Employee employee) {
        return employeeRep.save(employee);
    }

    //update employee


}
