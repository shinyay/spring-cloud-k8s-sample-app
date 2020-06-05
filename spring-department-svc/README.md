# Spring Cloud Kubernetes - Department Service

Department Service to call Employee Service
- Department SVC -> Spring Data MongoDB ->  MongoDB
- Department SVC -> Ribbon -> Employee SVC

## Description

## Demo

1. Deployment Service
1.1. bootstrap.yml
     
Spring Cloud application operates by creating a “bootstrap” context, which is a parent context for the main application. It is responsible for loading configuration properties from the external sources and for decrypting properties in the local external configuration files.

Instead of application.yml (or .properties), you can use bootstrap.yml bootstrap.yml is loaded before application.yml.

Typically it contains two properties:

- name of the application (`spring.application.name`)
- location of the configuration server (`spring.cloud.config.uri`)


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
