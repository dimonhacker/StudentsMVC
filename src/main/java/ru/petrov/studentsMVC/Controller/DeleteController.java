package ru.petrov.studentsMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.petrov.studentsMVC.Service.StudentService;

@Controller
@RequestMapping("/delete")
public class DeleteController {

    @Autowired
    StudentService studentService;

    @GetMapping("/{id}")
    public String deleteStudent(@PathVariable(name = "id") Long id, Model model) {
        String isDeleted = studentService.deleteStudentById(id);
        if (isDeleted.equals("OK"))
            return "redirect:/";
        else {
            model.addAttribute("error", isDeleted);
            return "error";
        }
    }
}
