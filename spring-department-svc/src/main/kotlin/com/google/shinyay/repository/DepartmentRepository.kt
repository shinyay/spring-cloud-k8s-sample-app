package com.google.shinyay.repository

import com.google.shinyay.model.Department
import org.springframework.data.repository.CrudRepository

interface DepartmentRepository : CrudRepository<Department, String> {

    fun findByOrganizationId(organizationId: Long): List<Department>
}