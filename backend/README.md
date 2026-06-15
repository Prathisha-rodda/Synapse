# Synapse Backend

The backend is built with Java 25, Spring Boot, and Maven.

This repo should not change your global Java version. Run backend commands with Java 25 explicitly:

```bash
JAVA_HOME=/Library/Java/JavaVirtualMachines/temurin-25.jdk/Contents/Home mvn test
```

## Planned Features

- User registration
- User login
- JWT authentication
- Career path APIs
- Project APIs
- Roadmap APIs
- Task progress APIs
- Dashboard summary API

## Planned Package Structure

```text
com.synapse.platform
  health
  auth
  user
  careerpath
  project
  roadmap
  progress
  dashboard
  common
  config
```

## First Build Tasks

1. Confirm the backend skeleton builds.
2. Add a simple health-check API. Done.
3. Add Spring Security.
4. Add MySQL and Spring Data JPA.
5. Create user entity and repository.
6. Build signup and login APIs.
7. Add JWT authentication.

## Current Files

### `pom.xml`

Defines the backend as a Maven project. It controls the Java version, Spring Boot version, dependencies, and build plugins.

### `.java-version`

Documents that this backend should use Java 25. Some Java version managers can read this automatically, but we will still use explicit `JAVA_HOME` commands so your work Java 11 setup stays safe.

### `src/main/java/com/synapse/platform/SynapseApplication.java`

The main entry point of the Spring Boot application. This is where the backend starts.

### `src/main/resources/application.yml`

The main configuration file. It defines the application name, active profile, and server port.

### `src/main/resources/application-local.yml`

Local development configuration. We will later add local MySQL settings here.

### `src/test/java/com/synapse/platform/SynapseApplicationTests.java`

The first test. It checks that the Spring application context can load successfully.

### `src/main/java/com/synapse/platform/health/HealthController.java`

Defines the first REST API endpoint: `GET /api/v1/health`. A controller receives HTTP requests and returns HTTP responses.

### `src/main/java/com/synapse/platform/health/HealthResponse.java`

Defines the JSON shape returned by the health API. Java records are useful for simple immutable request or response objects.

### `src/test/java/com/synapse/platform/health/HealthControllerTests.java`

Tests the health API without starting the full server. It uses `MockMvc` to simulate an HTTP request and verify the JSON response.
