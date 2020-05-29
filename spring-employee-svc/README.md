# Spring Cloud Kubernetes - Employee Service

Employee Service with MongoDB using Spring Cloud Kubernetes

## Description

## Demo
### 1. MongoDB Deployment YAML for Kubernetes
- [Deployment YAML](kubernetes/mongodb-deployment.yml)
- [ConfigMap YAML](kubernetes/mongodb-configmap.yml)
  - Database Name: **admin**
- [Secret YAML](kubernetes/mongodb-secret.yml)
  - Database User
  - Database Password

#### 1.1. Base64 encoded
- **mongodb-secret.yml**

```yaml
data:
  spring.data.mongodb.username: ZGV2ZWxvcGVy
  spring.data.mongodb.password: c2VjcmV0
```

- **base64 command**

```shell script
$ echo -n 'developer' | base64
$ echo -n 'secret' | base64
```

#### 1.2. Apply YAML for Kubernetes
```shell script
$ kubectl apply -f kubernetes/mongodb-configmap.yaml
$ kubectl apply -f kubernetes/mongodb-secret.yaml
$ kubectl apply -f kubernetes/mongodb-deployment.yaml
```

#### 1.3. Confirm MongoDB in the Pod
```shell script
$ kubectl exec -it pod/mongodb-1234567890-abcdef /bin/bash
```

```shell script
root@mongodb-79d8d9c878-kn285:/# mongo -u admin -p password
MongoDB shell version v4.2.6
connecting to: mongodb://127.0.0.1:27017/?compressors=disabled&gssapiServiceName=mongodb
Implicit session: session { "id" : UUID("7ed0d177-14cd-42d1-8ecf-809ba976ec32") }
MongoDB server version: 4.2.6
Server has startup warnings:
2020-05-26T12:57:40.367+0000 I  STORAGE  [initandlisten]
2020-05-26T12:57:40.367+0000 I  STORAGE  [initandlisten] ** WARNING: Using the XFS filesystem is strongly recommended with the WiredTiger storage engine
2020-05-26T12:57:40.367+0000 I  STORAGE  [initandlisten] **          See http://dochub.mongodb.org/core/prodnotes-filesystem
---
Enable MongoDB's free cloud-based monitoring service, which will then receive and display
metrics about your deployment (disk utilization, CPU, operation statistics, etc).

The monitoring data will be available on a MongoDB website with a unique URL accessible to you
and anyone you share the URL with. MongoDB may use this information to make product
improvements and to suggest MongoDB products and deployment options to you.

To enable free monitoring, run the following command: db.enableFreeMonitoring()
To permanently disable this reminder, run the following command: db.disableFreeMonitoring()
---

>
```

### 2. Employee Service
#### 2.1 bootstrap.yml
Spring Cloud application operates by creating a “bootstrap” context, which is a parent context for the main application.
It is responsible for loading configuration properties from the external sources and for decrypting properties in the local external configuration files.

Instead of application.yml (or .properties), you can use bootstrap.yml
`bootstrap.yml` is loaded before `application.yml`.

Typically it contains two properties:
- name of the application (`spring.application.name`)
- location of the configuration server (`spring.cloud.config.uri`)

### 3. 

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
