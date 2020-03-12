package idv.wayne.ledger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idv.wayne.ledger.entity.Employee;
import idv.wayne.ledger.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Transactional
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	@Transactional
	public Employee findById(int id){
		return employeeRepository.findById(id);
	}
	
	@Transactional
	public Employee save(Employee employee){
		return employeeRepository.save(employee);
	}
	
	@Transactional
	public void deleteById(int id){
		employeeRepository.deleteById(id);
	}
	
	
	

	
	
}
