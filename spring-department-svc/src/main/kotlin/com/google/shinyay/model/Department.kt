package com.google.shinyay.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "department")
data class Department(@Id val id: String,
                      val organizationId: Long,
                      val name: String,
                      @Transient var employees: List<Employee>) {
    fun employees(employees: List<Employee>) {this.employees = employees}
}