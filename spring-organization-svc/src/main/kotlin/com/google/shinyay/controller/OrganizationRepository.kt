package com.google.shinyay.controller

import com.google.shinyay.logger
import com.google.shinyay.model.Organization
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class OrganizationRepository(val repository: OrganizationRepository) {

    @GetMapping("/")
    fun findAll(): MutableIterable<Organization> {
        logger.info("Organization find")
        return repository.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: String): Organization {
        logger.info("Organization find: id=$id")
        return repository.findById(id)
    }

}