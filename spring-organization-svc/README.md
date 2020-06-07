# Spring Cloud Kubernetes - Organization Service

Organization Service to call Employee Service and Department Service

- Organization SVC -> Spring Data MongoDB -> MongoDB
- Organization SVC -> Ribbon -> Employee SVC
- Organization SVC -> Ribbon -> Department SVC

## Description

## Demo

1. Organization Service
1.1. Organization YAML for Kubernetes

- [ConfigMap YAML](kubernetes/organization-configmap.yml)
- [Secret YAML](kubernetes/organization-secret.yml)
- [Deployment YAML](kubernetes/organization-deployment.yml)

1.2. Apply YAML for Kubernetes

```shell script
$ kubectl apply -f kubernetes/organization-configmap.yml
$ kubectl apply -f kubernetes/organization-secret.yml
$ kubectl apply -f kubernetes/organization-deployment.yml
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
