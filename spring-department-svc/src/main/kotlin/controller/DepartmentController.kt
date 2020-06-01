package controller

import com.google.shinyay.client.EmployeeClient
import com.google.shinyay.logger
import com.google.shinyay.model.Department
import com.google.shinyay.model.Employee
import com.google.shinyay.repository.DepartmentRepository
import org.springframework.web.bind.annotation.*

@RestController
class DepartmentController(val repository: DepartmentRepository,
                           val employeeClient: EmployeeClient) {

    @GetMapping("/feign")
    fun listRest(): List<Employee> = employeeClient.findByDepartment("1")

    @PostMapping("/")
    fun add(@RequestBody department: Department): Department {
        logger.info("Department add: $department")
        return repository.save(department)
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: String): Department {
        logger.info("Department find: id=$id")
        return repository.findById(id).get()
    }

    @GetMapping("/")
    fun findAll(): MutableIterable<Department> {
        logger.info("Department find")
        return repository.findAll()
    }
}