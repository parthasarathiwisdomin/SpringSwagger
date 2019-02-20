package info.wisdomin.spingwithswagger.service;

import java.util.List;
import java.util.Optional;

import info.wisdomin.spingwithswagger.model.Employee;

public interface EmployeeService {
	
	public void createEmployee(Employee employee);
    public List<Employee> getEmployee();
    public Optional<Employee> findById(long id);
    public Employee update(Employee employee, long l);
    public void deleteEmployeeById(long id);

    
}
