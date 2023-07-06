package in.adham.springbootcrud.springbootcrudapi.service;

import java.util.List;

import in.adham.springbootcrud.springbootcrudapi.model.Employee;

public interface EmployeeService {
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	
}
