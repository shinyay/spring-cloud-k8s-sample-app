package com.google.shinyay.repository

import com.google.shinyay.model.Organization
import org.springframework.data.repository.CrudRepository

interface OrganizationRepository : CrudRepository<Organization, String> {
}