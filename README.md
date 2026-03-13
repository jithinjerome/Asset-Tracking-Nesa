# Asset Tracking System

A Spring Boot backend application for managing company assets.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok

## Features
- User Authentication (Login / Logout)
- Asset CRUD APIs
- Soft Delete implementation

## API Endpoints

### Authentication
POST /auth/login  
POST /auth/logout  

### Assets
POST /assets  
GET /assets  
GET /assets/{id}  
PATCH /assets/{id}  
DELETE /assets/{id}  

