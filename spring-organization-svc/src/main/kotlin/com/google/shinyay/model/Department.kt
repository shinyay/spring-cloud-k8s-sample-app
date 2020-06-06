package com.google.shinyay.model

data class Department(val id: Long,
                      val name: String,
                      val employees: List<Employee>)