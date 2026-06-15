# Synapse

Synapse is a project-based developer learning platform that helps developers become job-ready by learning through real implementation instead of disconnected tutorials.

The platform guides a user through a career path, recommends a real-world project, breaks that project into modules, explains the concepts needed for each module, and tracks progress as the user builds feature by feature.

## Problem

Many developers struggle with:

- Not knowing what to learn next
- Following random tutorials without direction
- Learning concepts without applying them
- Balancing work with consistent upskilling
- Preparing for interviews in a structured way

Most platforms provide courses, roadmaps, or project ideas separately. Synapse combines these into one practical learning experience.

## Core Idea

Synapse follows a simple principle:

> Learn by building.

Instead of saying "learn JWT today", Synapse frames learning around a real feature:

> To build authentication, you need JWT, REST APIs, password hashing, and database-backed users.

This helps users understand why each concept matters and how it is used in a real application.

## V1 Scope

The first version will focus on one complete learning path and one recommended project.

### Career Path

- Java Full Stack Developer

### Starter Project

- Expense Tracker

### Core Features

- User signup and login
- Career path selection
- Recommended project selection
- Module-based roadmap
- Concepts for each module
- Task checklist for each module
- Progress tracking
- Dashboard summary

AI features are intentionally not part of V1. They will be added after the core platform works well.

## Planned Tech Stack

### Frontend

- React
- TypeScript
- Vite
- React Router

### Backend

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- REST APIs

### Database

- MySQL

### Future Integrations

- GitHub integration
- AI mentor
- AI mock interviews
- AI resume review
- LeetCode tracking

## Repository Structure

```text
Synapse/
  backend/                 Spring Boot backend application
  database/                Database notes and schema planning
  docs/                    Product, architecture, API, and roadmap docs
  frontend/                React frontend application
  README.md                Project overview
```

## Build Plan

1. Define the MVP clearly.
2. Create the backend Spring Boot application.
3. Create the frontend React application.
4. Implement authentication.
5. Seed the Java Full Stack learning path.
6. Display project modules and tasks.
7. Track user progress.
8. Build the dashboard.
9. Deploy the application.

## Resume Positioning

Synapse can be presented as a full-stack product that demonstrates:

- Product thinking
- Full-stack architecture
- Authentication and authorization
- REST API design
- Relational database design
- Frontend state and routing
- Progress tracking workflows
- Future-ready AI integration planning

