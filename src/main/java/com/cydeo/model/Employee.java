package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String firstName, lastName, email, password, address, address2, city, zip;
    //Thymeleaf accepts yyyy-mm-dd, but localdate mm-dd-yyyy
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate birthday;
    private String state;
}
