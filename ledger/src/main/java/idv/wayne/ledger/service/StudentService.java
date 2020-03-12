package idv.wayne.ledger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idv.wayne.ledger.entity.Student;
import idv.wayne.ledger.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student findById(int id){
		return studentRepository.findById(id);
	}
	
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
	
	
	
	
}
