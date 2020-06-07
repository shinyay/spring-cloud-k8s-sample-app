package com.google.shinyay.client

import com.google.shinyay.model.Employee
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient("employee")
interface EmployeeClient {

    @GetMapping("/organization/{organizationId}")
    fun findByOrganization(@PathVariable("organizationId") organizationId: String): List<Employee>
}