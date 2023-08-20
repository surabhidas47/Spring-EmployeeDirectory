package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deptNumber;
    private String deptName;
    private Employee manager;

    public Department() {
    }

    public Department(Long deptNumber, String deptName, Employee manager) {
        this.deptNumber = deptNumber;
        this.deptName = deptName;
        this.manager = manager;
    }

    public Department(String deptName, Employee manager) {
        this.deptNumber = null;
        this.deptName = deptName;
        this.manager = manager;
    }




}
