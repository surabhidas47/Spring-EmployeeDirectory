package Repository;

import Models.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRep extends CrudRepository<Department, Long> {
}
