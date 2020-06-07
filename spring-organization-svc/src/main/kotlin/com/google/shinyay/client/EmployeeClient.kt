package com.google.shinyay.client

import org.springframework.cloud.openfeign.FeignClient

@FeignClient("employee")
interface EmployeeClient {
}