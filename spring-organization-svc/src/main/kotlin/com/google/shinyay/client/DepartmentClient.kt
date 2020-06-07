package com.google.shinyay.client

import org.springframework.cloud.openfeign.FeignClient

@FeignClient(name = "department")
class DepartmentClient {
}