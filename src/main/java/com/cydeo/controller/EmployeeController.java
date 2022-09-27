package com.cydeo.controller;

import com.cydeo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class EmployeeController {
    @GetMapping("/employee")
    public String employeePage(Model model){
        List<String> states = Arrays.asList("Alaska", "Maryland", "California");
        model.addAttribute("states", states);
        model.addAttribute("employee", new Employee());
        return "/register";
    }

    @PostMapping("/employee-list")
    public String employeeist(@ModelAttribute Employee employee){
        return "redirect:/employee";
    }


}
