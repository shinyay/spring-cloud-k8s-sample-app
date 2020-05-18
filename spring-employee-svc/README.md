# Spring Cloud Kubernetes - Employee Service

Employee Service with MongoDB using Spring Cloud Kubernetes

## Description

## Demo
### Deployment YAML for Kubernetes
- [Deployment YAML](kubernetes/mongodb-deployment.yml)
- [ConfigMap YAML](kubernetes/mongodb-configmap.yml)
 - Database Name Configuration
- [Secret YAML](kubernetes/mongodb-secret.yml)
 - Database User
 - Database Password

#### Base64 encoded
##### base64 command
```shell script
$ echo -n 'password' | base64
```

#### Apply YAML for Kubernetes
```shell script
$ kubectl apply -f kubernetes/mongodb-configmap.yaml
$ kubectl apply -f kubernetes/mongodb-secret.yaml
$ kubectl apply -f kubernetes/mongodb-deployment.yaml
```

### Employee Service
#### bootstrap.yml
Spring Cloud application operates by creating a “bootstrap” context, which is a parent context for the main application.
It is responsible for loading configuration properties from the external sources and for decrypting properties in the local external configuration files.

Instead of application.yml (or .properties), you can use bootstrap.yml

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
