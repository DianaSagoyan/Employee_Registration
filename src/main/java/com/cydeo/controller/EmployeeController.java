package com.cydeo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    public String employeePage(){
        return "index";
    }
}
