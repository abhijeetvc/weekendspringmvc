package com.weekendspmvc.weekendspringmvc.controller;

import com.weekendspmvc.weekendspringmvc.model.Employee;
import com.weekendspmvc.weekendspringmvc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController  // = @Controller + @ResponseBody
@Controller
public class MyController {

    @Autowired
    private EmployeeRepository employeeRepository;

   // @ResponseBody
    @GetMapping("/index")
    public String check(Model model){
        model.addAttribute("employee",new Employee());
        return "index";
    }

    @PostMapping("/savedata")
    public String saveEmployee(@ModelAttribute Employee employee){
        employeeRepository.save(employee);
        return "welcome";
    }
}
