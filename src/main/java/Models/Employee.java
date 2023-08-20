package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Manager, ReportingE{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idNumber;
    private String firstName;
    private String lastName;
    private String title;
    private Integer phoneNumber;
    private String email;
    private Double hireDate;
    private Department department;
    private Employee manager;


    public Employee() {
    }

    public Employee(Long idNumber, String firstName, String lastName, String title, Integer phoneNumber, String email, Double hireDate, Department department, Employee manager ) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hireDate = hireDate;
        this.department=department;
        this.manager=manager;
    }

    //null for when creating an employee??
    public Employee( String firstName, String lastName, String title, Integer phoneNumber, String email, Double hireDate,Department department, Employee manager) {
        this.idNumber = null;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hireDate = hireDate;
        this.department=department;
        this.manager=manager;
    }


    public Long getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Double getHireDate() {
        return hireDate;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHireDate(Double hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String receiveReport() {
        return null;
    }

    @Override
    public String submitReport() {
        return null;
    }
}
