# Database Design

This document defines the initial relational database model for Synapse V1.

## Main Tables

### users

Stores registered platform users.

Fields:

- id
- name
- email
- password_hash
- experience_level
- target_duration_weeks
- weekly_study_hours
- created_at
- updated_at

### career_paths

Stores available career paths.

Fields:

- id
- name
- description
- active
- created_at
- updated_at

Example:

- Java Full Stack Developer

### projects

Stores recommended projects for a career path.

Fields:

- id
- career_path_id
- name
- description
- difficulty
- estimated_duration_weeks
- active
- created_at
- updated_at

Example:

- Expense Tracker

### modules

Stores project modules.

Fields:

- id
- project_id
- title
- description
- sequence_number
- created_at
- updated_at

Examples:

- Authentication
- Expense CRUD
- Dashboard Analytics
- Deployment

### concepts

Stores concepts attached to a module.

Fields:

- id
- module_id
- category
- title
- description
- sequence_number

Examples:

- Backend: Spring Boot REST APIs
- Backend: JWT
- Frontend: React forms
- Database: JPA relationships

### tasks

Stores implementation tasks for a module.

Fields:

- id
- module_id
- title
- description
- sequence_number
- created_at
- updated_at

Examples:

- Create login API
- Build signup page
- Implement expense CRUD

### user_project_enrollments

Stores which project a user is following.

Fields:

- id
- user_id
- project_id
- started_at
- status

### user_task_progress

Stores task completion per user.

Fields:

- id
- user_id
- task_id
- completed
- completed_at
- updated_at

## Relationships

- One career path has many projects.
- One project has many modules.
- One module has many concepts.
- One module has many tasks.
- One user can enroll in many projects.
- One user can complete many tasks.

