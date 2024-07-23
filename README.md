# CI-CD-AKS-Deployment

This project contains a simple Spring Boot Java web application, which is deployed to an Azure Kubernetes Service (AKS) cluster using an Azure DevOps CI/CD pipeline.

## Project Structure

- `src/`: Contains the source code for the Java web application.
- `.gitignore`: Specifies files and directories that should be ignored by Git.
- `AKS_CI_CD.yml`: Contains the Azure DevOps pipeline configuration for building and deploying the application.
- `Dockerfile`: Defines the Docker image for the application.
- `README.md`: Provides an overview of the project.
- `deployment.yaml`: Kubernetes deployment configuration.
- `pom.xml`: Maven project file for managing dependencies and build configuration.
- `service.yaml`: Kubernetes service configuration.

## Prerequisites

- Java Development Kit (JDK)
- Maven
- Docker
- Azure account with AKS and Azure DevOps set up

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/yourusername/CI-CD-AKS-Deployment.git
cd CI-CD-AKS-Deployment
```

### Setting Up Azure DevOps CI/CD Pipeline

1. **Create a New Pipeline:** In Azure DevOps, create a new pipeline and link it to your GitHub repository.

2. **Configure the Pipeline:** Use the AKS_CI_CD.yml file to configure the pipeline. This file contains steps for building the application, creating a Docker image, pushing the image to a container registry, and deploying the application to an AKS cluster.

### Verify the Deployment

**Check the status of your pods and services to ensure the application is running correctly:**

```bash
kubectl get pods
kubectl get services
```
