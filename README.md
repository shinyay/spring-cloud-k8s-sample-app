# Spring Cloud Kubernetes Sample Application

`Spring Cloud Kubernetes` provide Spring Cloud common interface implementations that consume Kubernetes native services. 

- `Discovery Client` implementation that resolves service names to Kubernetes Services.
- Load application properties from Kubernetes `ConfigMaps` and `Secrets`.
- `Ribbon` client-side load balancer with server list obtained from Kubernetes Endpoints.

## Description

|Microservices Capability|Spring Cloud|Kubernetes|
|------------------------|------------|----------|
|Configuration Management|Config Server|ConfigMap / Secret|
|Service Discovery|Eureka|Service / Ingress|
|Load Balancing|Spring Loadbalancer / Ribbon|Service|
|API Gateway|Zuul|Service / Ingress|
|Service Security|Spring Cloud Security|---|
|Centralized Logging|ELK (LogStash)|EFK (Fluentd)|
|Centralized Metrics|Micrometer|Prometheus / Grafana|
|Centralized Tracing|Spring Cloud Sleuth / Zipkin|Zipkin|
|Resilience / Fault Tolerance|Hystrix|Health Check|

### Application Archiecture
![app-architecture](images/app-architecture.png)

## Demo
### Spring Dependency
#### Spring Cloud Kubernetes
```
dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-kubernetes-all")
}
```

|Starter|Feature|(Spring Cloud)|
|-------|-------|------------|
|spring-cloud-starter-kubernetes|Discovery Client|Eureka|
|spring-cloud-starter-kubernetes-config|ConfigMap / Secret|Config Server|
|spring-cloud-starter-kubernetes-ribbon|ClientSide Load balancer|Ribbon|
|spring-cloud-starter-kubernetes-all|All of the above|All of the above|

### Service Discovery

Service Discovery enables to query Kubernetes Endpoints(services) **by name**
Ribbon uses the discovery feature to fetch pods list.

```kotlin
@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeApplication
```

#### Discoveried Name
- bootstrap.yml
```
spring:
  application:
    name: employee
```

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
