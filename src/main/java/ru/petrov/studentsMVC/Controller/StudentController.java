package ru.petrov.studentsMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.petrov.studentsMVC.Entity.Group;
import ru.petrov.studentsMVC.Entity.Student;
import ru.petrov.studentsMVC.Service.GroupService;
import ru.petrov.studentsMVC.Service.StudentService;

import java.util.List;

@Controller

public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    GroupService groupService;

    @GetMapping("/create")
    public String createStudent(Model model){
        model.addAttribute("student", new Student());
        List<Group> groups = groupService.createGroups();
        model.addAttribute("groups", groups);
        return "create";
    }

    @PostMapping("/create")
    public String  toIndex(@ModelAttribute(name = "student") Student student, Model model){
        if(student!=null)
        studentService.saveStudent(student);
        return "redirect:/";
    }

}
