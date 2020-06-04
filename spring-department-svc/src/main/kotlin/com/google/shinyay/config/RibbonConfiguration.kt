package com.google.shinyay.config

import com.netflix.client.config.IClientConfig
import com.netflix.loadbalancer.PingUrl
import com.netflix.loadbalancer.WeightedResponseTimeRule
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.context.annotation.Bean

class RibbonConfiguration(val discoveryClient: DiscoveryClient) {

    constructor(discoveryClient: DiscoveryClient, serviceId: String) : this(discoveryClient) {
        this.serviceId = serviceId
    }

    var serviceId = "client"

    @Bean
    fun ribbonPing(config: IClientConfig) = PingUrl()

    @Bean
    fun ribbonRule(config: IClientConfig) = WeightedResponseTimeRule()
}