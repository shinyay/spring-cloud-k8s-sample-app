package com.google.shinyay.repository

import com.google.shinyay.model.Employee
import org.springframework.data.repository.CrudRepository

interface EmployeeRepository : CrudRepository<Employee, String> {
    fun findByDepartmentId(departmentId: Long)
    fun findByOrganizationId(organizationId: Long)
}