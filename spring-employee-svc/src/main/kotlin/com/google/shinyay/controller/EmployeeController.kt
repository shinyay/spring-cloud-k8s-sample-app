package com.google.shinyay.controller

import com.google.shinyay.logger
import com.google.shinyay.model.Employee
import com.google.shinyay.repository.EmployeeRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeController(val repository: EmployeeRepository) {

    @PostMapping("/")
    fun add(@RequestBody employee: Employee): Employee {
        logger.info("Employee add: $employee")
        return repository.save(employee)
    }
}