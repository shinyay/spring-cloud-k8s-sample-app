# Spring Cloud Kubernetes - Department Service

Department Service to call Employee Service
- Department SVC -> Spring Data MongoDB ->  MongoDB
- Department SVC -> Ribbon -> Employee SVC

## Description

## Demo

1. Deployment Service
1.1. Deployment YAML for Kubernetes

- [ConfigMap YAML](kubernetes/department-configmap.yml)
- [Secret YAML](kubernetes/department-secret.yml)
- [Deployment YAML](kubernetes/department-deployment.yml)

1.2. Apply YAML for Kubernetes

```shell script
$ kubectl apply -f kubernetes/department-configmap.yml
$ kubectl apply -f kubernetes/department-secret.yml
$ kubectl apply -f kubernetes/department-deployment.yml
```

## Features

- Client-side Load Balancing
- DiscoveryClient for Kubernetes

### Feign and Ribbon
- Feign
  - Declarative REST Client
  - https://cloud.spring.io/spring-cloud-openfeign/reference/html/
- Ribbon
  - Client Side Load Balancer
  - https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-ribbon.html

Feign <-> Ribbon <-> Services

```kotlin
@SpringBootApplication
@EnableFeignClients
@RibbonClients(defaultConfiguration = [RibbonConfiguration::class])
class SpringCloudKubernetesApplication
```

```kotlin
@FeignClient(name = "employee")
interface EmployeeClient {

    @GetMapping("/department/{departmentId}")
    fun findByDepartment(@PathVariable("departmentId") departmentId: String): List<Employee>
}
```

### DiscoveryClient
DiscoveryClient for Kubernetes allows you to query Kubernetes endpoints by name.
A service is typically exposed by the Kubernetes API server as a collection of endpoints which represent http, https addresses that a client can access from a Spring Boot application running as a pod.

```kotlin
@SpringBootApplication
@EnableDiscoveryClient
class SpringCloudKubernetesApplication
```
## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
