# Web Coding Challenge

This is an implementation of an app that lists shops nearby, using Spring boot and Vue Js.
The app is not yet complete, other functionalities will later be implemented.

## Technologies 

* [Spring Boot](https://projects.spring.io/spring-boot/)
* [vue.js](https://vuejs.org/)
* [Axios](https://github.com/axios/axios)
* [MongoDB](https://github.com/axios/axios)
* [Bootstrap](https://docs.mongodb.com/)
* [Maven](https://maven.apache.org/) - Dependency Management


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

If you work with Gradle, convert the project from Maven to Gradle. You can use this [tutorial](https://www.credera.com/blog/custom-application-development/converting-spring-boot-project-maven-gradle-sts/?PageSpeed=noscript).

### Setting up the database

* After downloading and unzipping the project, download the latest release of [MongoDB](https://www.mongodb.com/download-center#community)
* Start MongoDB 

```
sudo service mongodb start
```
If you're not on Linux, check out this [tutorial](https://www.tutorialspoint.com/mongodb/mongodb_environment.htm)

* Create a database named shops
```
use shops
```
* Create two collections, shops and users

```
db.createCollection("shops")
db.createCollection("users")
```
* Import the collections
```
mongoimport --db shops --collection shops  --file shops.metadata.json
mongoimport --db shops --collection users  --file shops.metadata.json
```

### GeoLocation

In this project I have used geoip2 to recover the users coordinates from their IP address that I get once they sign up/ login, for that you'll need to download the [GeoLite2 database](http://www.baeldung.com/geolocation-by-ip-with-maxmind) and add its path to the RawDBDemoGeoIPLocationService class' constructor. (You may put it inside the project and call it internally if you wish)

![getting user ip](https://i.imgur.com/tVsWeii.png)

### Running the app

* Build and run the project as a spring boot application.


## Authors

* **Ouissal Benameur**

## Acknowledgments

* Inspired from @arocketman Spring Boot Tutorial

