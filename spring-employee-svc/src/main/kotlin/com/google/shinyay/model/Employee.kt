package com.google.shinyay.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Employee (@Id val id: String,
                     val organizationId: Long,
                     val departmentId: Long,
                     val name: String,
                     val age: Int,
                     val position: String)