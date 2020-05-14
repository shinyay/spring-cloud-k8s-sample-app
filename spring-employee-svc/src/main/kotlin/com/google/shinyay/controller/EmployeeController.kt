package com.google.shinyay.controller

import com.google.shinyay.logger
import com.google.shinyay.model.Employee
import com.google.shinyay.repository.EmployeeRepository
import org.springframework.web.bind.annotation.*

@RestController
class EmployeeController(val repository: EmployeeRepository) {

    @PostMapping("/")
    fun add(@RequestBody employee: Employee): Employee {
        logger.info("Employee add: $employee")
        return repository.save(employee)
    }

    @GetMapping("/")
    fun findAll(): MutableIterable<Employee> {
        logger.info("Employee find")
        return repository.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: String): Employee {
        logger.info("Employee find: id=$id")
        return repository.findById(id).get()
    }

    @GetMapping("/department/{departmentId}")
    fun findByDepartment(@PathVariable("departmentId")id: Long) {
        logger.info("Employee find: departmentId=$id")
        return repository.findByDepartmentId(id)
    }

    @GetMapping("/organization/{organizationId}")
    fun findByOrganization(@PathVariable("organizationId")id: Long) {
        logger.info("Employee find: organizationId=$id")
        repository.findByOrganizationId(id)
    }
}