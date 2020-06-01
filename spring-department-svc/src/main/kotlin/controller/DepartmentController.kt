package controller

import com.google.shinyay.client.EmployeeClient
import com.google.shinyay.model.Employee
import com.google.shinyay.repository.DepartmentRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DepartmentController(val repository: DepartmentRepository,
                           val employeeClient: EmployeeClient) {

    @GetMapping("/feign")
    fun listRest(): List<Employee> = employeeClient.findByDepartment("1")
}