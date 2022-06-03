package ru.petrov.studentsMVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.petrov.studentsMVC.Entity.Student;
import ru.petrov.studentsMVC.Repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> findAll(){
        return (List<Student>) studentRepository.findAll();
    }

    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    public String deleteStudentById(Long id){
        try {
            studentRepository.deleteById(id);
            return "OK";
        }
        catch (org.springframework.dao.EmptyResultDataAccessException ex){
            return ex.getMessage();
        }

    }

}
