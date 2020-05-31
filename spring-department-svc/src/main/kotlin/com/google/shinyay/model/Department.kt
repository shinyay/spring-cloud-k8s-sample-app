package com.google.shinyay.model

import org.springframework.data.annotation.Id
data class Department(@Id val id: String,
                      val organizationId: Long,
                      val name: String,
                      @Transient val employees: List<Employee>)