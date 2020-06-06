package com.google.shinyay.model

import org.springframework.data.annotation.Id

data class Organization(@Id val id: String,
                        val name: String,
                        val address: String,
                        val department: List<Department>,
                        val employee: List<Employee>)