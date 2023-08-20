package Repository;

import Models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRep extends CrudRepository<Employee,Long> {
}
