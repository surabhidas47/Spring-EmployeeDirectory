package Service;

import Models.Department;
import Models.Employee;
import Repository.DepartmentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRep departmentRep;

    public DepartmentService(DepartmentRep departmentRep) {
        this.departmentRep = departmentRep;
    }

    public Iterable<Department> index() {
        return departmentRep.findAll();
    }


}
