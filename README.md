# Match Analytics Lite — Starter Template

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3-green)
![Angular](https://img.shields.io/badge/Angular-18-red)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue)
![Chart.js](https://img.shields.io/badge/Chart.js-4.5.0-orange)

Welcome to **Match Analytics Lite**, a starter template for managing football match data with a full-stack Java Spring Boot + Angular application.

---

## Table of Contents

* [Features](#features)
* [Back End](#back-end)
* [Front End](#front-end)
* [Prerequisites](#prerequisites)
* [Setup and Run](#setup-and-run)
* [Notes](#notes)

---

## Features

* REST API for **Match**, **Player**, and **Event** entities
* Player statistics table (name, goals, assists)
* Chart comparison of player goals and assists using Chart.js
* Full-stack integration with Angular front end and Spring Boot back end

---

## Back End

Built with **Java Spring Boot 3** and **PostgreSQL**.

### Endpoints

* `/players` – List all players with stats
* `/matches` – List all matches
* `/events` – List all events for matches/players

### Setup

1. Configure your database in `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

2. Install dependencies:

```bash
mvn clean install
```

3. Run the API:

```bash
mvn spring-boot:run
```

4. Test endpoints at: [http://localhost:8080](http://localhost:8080)

---

## Front End

Implemented with **Angular 18**.

### Features

* Table showing players with their statistics (name, goals, assists)
* Bar chart comparing players’ goals and assists
* Uses **Chart.js 4.5.0**

### Setup

1. Install dependencies:

```bash
npm install
```

2. Run the front end:

```bash
ng serve
```

3. Open the app at: [http://localhost:4200](http://localhost:4200)

---

## Prerequisites

* Java 17+
* Maven 3+
* Node.js 18+ and npm
* PostgreSQL 15+

---

## Notes / Limitations

Some features could not be fully implemented due to time constraints:

* Dockerization of back-end and front-end
* Angular signals for dynamic data
* Multiple charts for extended statistics
