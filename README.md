# VIA Tabloid (VIATAB)

VIATAB is a full-stack DevOps and Cloud course project. It is a web application where users can register, log in, create stories, view stories by department, edit their own stories, and delete their own stories.

The main purpose of this project is to demonstrate DevOps practices using:

- Git and GitHub
- Docker
- Docker Compose
- Kubernetes and Minikube
- GitHub Actions CI/CD
- Automated backend tests

## Project Goal

The assignment requires a VIA Tabloid application with:

- A frontend application
- A backend API
- A database
- At least three VIA departments
- Story features such as create, read, update, and delete
- Docker containers
- Docker Compose
- Kubernetes deployment files
- CI/CD pipeline with GitHub Actions

This project implements those requirements using React, Spring Boot, PostgreSQL, Docker, Kubernetes manifests, and GitHub Actions.

## Tech Stack

### Frontend

- React
- TypeScript
- Vite
- Axios
- React Router
- Context API
- Tailwind CSS

### Backend

- Java 21
- Spring Boot
- Spring Security
- JWT authentication
- Spring Data JPA
- Hibernate
- JUnit
- Mockito
- MockMvc
- H2 test database

### Database

- PostgreSQL

### DevOps

- Docker
- Docker Compose
- Kubernetes
- Minikube
- GitHub Actions

## Features

### Authentication

- User registration
- User login
- JWT token authentication
- Protected frontend routes
- Protected backend API endpoints

### Story Management

- Create stories
- View stories
- Edit owned stories
- Delete owned stories
- Filter stories by department, category, and status
- Search stories
- View personal stories in My Stories

### Departments

The application supports at least three departments:

- Software Engineering
- Business
- Construction

## DevOps Assignment Coverage

| Requirement | Status |
| --- | --- |
| Frontend app | Covered |
| Backend app | Covered |
| PostgreSQL database | Covered |
| Dockerfile for backend | Covered |
| Dockerfile for frontend | Covered |
| Docker Compose file | Covered |
| Kubernetes deployment files | Covered |
| Kubernetes service files | Covered |
| PVC for database persistence | Covered |
| Kubernetes Secret for database credentials | Covered |
| GitHub Actions CI/CD workflow | Covered |
| Backend tests in CI | Covered |
| Frontend build in CI | Covered |
| Minikube deployment in CD | Covered |

## Project Structure

```text
VIATAB/
├── backend/
│   └── viatab-backend/
│       ├── Dockerfile
│       ├── pom.xml
│       └── src/
├── frontend/
│   └── viatab-frontend/
│       ├── Dockerfile
│       ├── package.json
│       └── src/
├── k8s/
│   ├── backend-deployment.yaml
│   ├── backend-service.yaml
│   ├── db-deployment.yaml
│   ├── db-service.yaml
│   ├── db-pvc.yml
│   ├── db-secret.yml
│   ├── frontend-deployment.yaml
│   └── frontend-service.yaml
└── docker-compose.yml
