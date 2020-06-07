package com.google.shinyay.controller

import com.google.shinyay.logger
import com.google.shinyay.model.Organization
import com.google.shinyay.repository.OrganizationRepository
import org.springframework.web.bind.annotation.*

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
        return repository.findById(id).get()
    }

    @PostMapping("/")
    fun add(@RequestBody organization: Organization): Organization {
        logger.info("Organization add: $organization")
        return repository.save(organization)
    }
}