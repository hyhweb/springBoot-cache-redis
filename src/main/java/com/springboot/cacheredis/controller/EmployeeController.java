package com.springboot.cacheredis.controller;

import com.springboot.cacheredis.bean.Employee;
import com.springboot.cacheredis.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployService employService;
    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id) {
        Employee empById = employService.getEmpById(id);
        return empById;
    }
    @GetMapping("/emp")
    public Employee updateEmp(Employee employee){
        Employee emp = employService.updateEmp(employee);
        return  emp;
    }
    @GetMapping("/delEmp")
    public  String deleteEmp(Integer id){
        employService.deleteEmp(id);
        return "success";
    }

}
