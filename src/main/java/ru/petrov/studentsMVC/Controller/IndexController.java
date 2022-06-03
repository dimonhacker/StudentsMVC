package ru.petrov.studentsMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.petrov.studentsMVC.Service.StudentService;

@Controller
public class IndexController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public  String getIndex(Model model){
        model.addAttribute("students",studentService.findAll());
        return "index";
    }
}
