package Models;

public class Employee {

    private Long idNumber;
    private String firstName;
    private String lastName;
    private String title;
    private Integer phoneNumber;
    private String email;
    private Double hireDate;

    public Employee() {
    }

    public Employee(Long idNumber, String firstName, String lastName, String title, Integer phoneNumber, String email, Double hireDate) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hireDate = hireDate;
    }





}
