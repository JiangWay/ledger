package idv.wayne.ledger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idv.wayne.ledger.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public Student findById(int id);
}
