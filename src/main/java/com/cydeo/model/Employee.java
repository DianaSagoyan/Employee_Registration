package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String firstName, lastName, email, password, streetAddress, apt, city, zip;
    private LocalDate birthday;
    private List<String> state;
}
