package info.wisdomin.spingwithswagger.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import info.wisdomin.spingwithswagger.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	


}