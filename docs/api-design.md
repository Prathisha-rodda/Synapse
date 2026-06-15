# API Design

This document defines the initial REST API plan for Synapse V1.

## API Conventions

- Base path: `/api/v1`
- Request and response format: JSON
- Authentication: JWT bearer token
- Protected APIs require `Authorization: Bearer <token>`

## Auth APIs

### Signup

`POST /api/v1/auth/signup`

Request:

```json
{
  "name": "Prathisha",
  "email": "prathisha@example.com",
  "password": "password123"
}
```

Response:

```json
{
  "id": 1,
  "name": "Prathisha",
  "email": "prathisha@example.com"
}
```

### Login

`POST /api/v1/auth/login`

Request:

```json
{
  "email": "prathisha@example.com",
  "password": "password123"
}
```

Response:

```json
{
  "token": "jwt-token",
  "user": {
    "id": 1,
    "name": "Prathisha",
    "email": "prathisha@example.com"
  }
}
```

## Career Path APIs

### List Career Paths

`GET /api/v1/career-paths`

Returns all active career paths.

## Project APIs

### List Projects For Career Path

`GET /api/v1/career-paths/{careerPathId}/projects`

Returns recommended projects for a selected career path.

### Enroll In Project

`POST /api/v1/projects/{projectId}/enroll`

Creates a project enrollment for the logged-in user.

## Roadmap APIs

### Get Project Roadmap

`GET /api/v1/projects/{projectId}/roadmap`

Returns modules, concepts, tasks, and user progress for a project.

## Progress APIs

### Complete Task

`PUT /api/v1/tasks/{taskId}/complete`

Marks a task as completed for the logged-in user.

### Reopen Task

`PUT /api/v1/tasks/{taskId}/reopen`

Marks a completed task as incomplete for the logged-in user.

## Dashboard APIs

### Get Dashboard Summary

`GET /api/v1/dashboard`

Returns:

- Current project
- Completed task count
- Total task count
- Overall progress percentage
- Current module
- Next recommended task

