package ru.petrov.studentsMVC.Repository;

import org.springframework.data.repository.CrudRepository;
import ru.petrov.studentsMVC.Entity.Student;

public interface StudentRepository extends CrudRepository<Student,Long> {


}
