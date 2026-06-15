# MVP Scope

## MVP Goal

Build a working full-stack platform where a user can follow a Java Full Stack learning roadmap by completing modules and tasks for an Expense Tracker project.

## Primary Modules

### 1. Authentication

Users can create an account, log in, and access protected platform pages.

Concepts learned:

- REST APIs
- Password hashing
- JWT authentication
- Spring Security basics
- React forms

Tasks:

- Create signup API
- Create login API
- Store users in MySQL
- Build signup page
- Build login page
- Store auth token on the frontend
- Protect dashboard route

### 2. Roadmap

Users can see a structured roadmap for the selected project.

Concepts learned:

- Relational data modeling
- One-to-many relationships
- API response design
- Frontend list rendering

Tasks:

- Create career path table
- Create project table
- Create module table
- Create task table
- Seed Java Full Stack roadmap data
- Build roadmap page

### 3. Progress Tracking

Users can mark tasks as complete and see progress.

Concepts learned:

- User-specific data
- Progress calculation
- Backend update APIs
- Frontend state updates

Tasks:

- Create user progress table
- Add complete task API
- Add incomplete task API
- Calculate module progress
- Calculate overall project progress
- Display progress bars

### 4. Dashboard

Users can see a summary of their learning journey.

Concepts learned:

- Aggregated backend data
- Dashboard UI
- Metrics display
- API integration

Tasks:

- Show current project
- Show completed tasks count
- Show module progress
- Show next recommended task
- Show overall completion percentage

## MVP Pages

- Login
- Signup
- Dashboard
- Career Path Selection
- Project Selection
- Roadmap
- Module Details

## MVP APIs

- Auth APIs
- User APIs
- Career path APIs
- Project APIs
- Module APIs
- Task progress APIs

