package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Employee;
import com.cydeo.service.EmployeeService;
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

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public String employeePage(Model model){
        model.addAttribute("states", DataGenerator.getAllStates());
        model.addAttribute("employee", new Employee());
        return "/register";
    }

    @PostMapping("/insert")
    public String employeeList(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String listEmployees(Model model){
        model.addAttribute("employeeList", employeeService.readAllEmployees());
        return "/employee-list";
    }

}
