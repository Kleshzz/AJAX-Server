# Java AJAX Server

A production-ready Spring Boot 3.4+ template for handling AJAX requests. Optimized for VS Code and IntelliJ IDEA.

## Features
- **DTO Support**: Strongly typed request and response handling.
- **Validation**: Jakarta Validation for incoming JSON payloads.
- **Global Exception Handling**: Returns structured JSON errors instead of stack traces.
- **Docker Integration**: Includes Dockerfile and docker-compose.yml.
- **CORS Configuration**: Pre-configured for cross-origin frontend requests.
- **Security**: Updated dependencies to mitigate known vulnerabilities (CVEs).
- **Cross-Platform**: Windows/Linux/MacOS

## Prerequisites
- Java 17 or higher
- Docker (optional)
- Maven (included via wrapper)

## Quick Start

### Windows
```bash
run.bat
```

### Linux / macOS
```bash
chmod +x run.sh
./run.sh
```

### Docker
```bash
docker-compose up --build