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

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
