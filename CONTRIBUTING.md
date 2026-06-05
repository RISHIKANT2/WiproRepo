Contributing Guidelines for MetroRide-Java-API

Thank you for contributing to the MetroRide-Java-API project.

This document defines the standard Git workflow, branch strategy, commit message conventions, and merge request process that all developers should follow while working on this project.

Project Overview

MetroRide-Java-API is a Spring Boot REST API project that provides metro timing information.

Technology Stack
Java 17
Spring Boot
Maven
Gradle
Git
Project Structure
MetroRide-Java-API
│
├── src/main/java
│   └── com.metroride.MetroRide_Java_API
│       ├── MetroRideJavaApiApplication.java
│       └── controller
│           └── MetroController.java
│
├── src/main/resources
│
├── pom.xml
├── build.gradle
├── settings.gradle
├── README.md
├── VERSION.txt
└── CONTRIBUTING.md
Branch Naming Rules

To maintain a clean repository structure, all developers must follow the branch naming convention below.

Main Branch
main

The main branch always contains stable and production-ready code.

Developers should never work directly on the main branch.

Feature Branches

Feature branches are used for developing new functionality.

Format:

feature/<feature-name>

Examples:

feature/build-setup
feature/metro-controller
feature/gradle-support
feature/api-enhancement
Bug Fix Branches

Format:

bugfix/<bug-name>

Examples:

bugfix/controller-error
bugfix/build-failure
Documentation Branches

Format:

docs/<documentation-name>

Examples:

docs/readme-update
docs/contributing-guide
Commit Message Format

Every commit message should clearly describe the change being made.

Standard Format
<type>: <description>
Commit Types
Feature
feat: add metro timing controller

Used when introducing new functionality.

Build
build: add gradle build configuration

Used when modifying build-related files.

Fix
fix: resolve controller mapping issue

Used when fixing bugs.

Documentation
docs: add contributing guidelines

Used for README, CONTRIBUTING, or other documentation updates.

Refactor
refactor: improve project structure

Used when restructuring code without changing behavior.

Test
test: add controller unit tests

Used when adding or modifying tests.

Merge Request Guidelines

Before creating a merge request, every developer must complete the following checklist.

Step 1: Verify Maven Build

Run:

mvn clean package

Expected Result:

BUILD SUCCESS
Step 2: Verify Gradle Build

Run:

gradle build

Expected Result:

BUILD SUCCESSFUL
Step 3: Check Git Status

Run:

git status

Ensure no unintended files are being committed.

Step 4: Push Changes

Push changes to the feature branch.

Example:

git push origin feature/build-setup
Step 5: Create Merge Request

Create a merge request from:

feature/build-setup → main

Include:

Summary of changes
Build verification details
Testing results
Related task information
Step 6: Code Review

At least one reviewer should approve the changes before merging.

Step 7: Merge

After successful review and build validation, merge the feature branch into the main branch.

Git Workflow Example
Clone Repository
git clone <repository-url>
Create Feature Branch
git checkout -b feature/build-setup
Make Changes

Update source code or documentation.

Stage Changes
git add .
Commit Changes
git commit -m "feat: add metro timing endpoint"
Push Branch
git push origin feature/build-setup
Create Merge Request

Submit merge request for review.

Files That Should Not Be Committed

The following files and folders should never be committed to Git.

Maven Build Output
target/
Gradle Build Output
build/
.gradle/
Eclipse Files
.project
.classpath
.settings/
IntelliJ Files
.idea/
*.iml
VS Code Files
.vscode/
Best Practices
Create a separate branch for every task.
Write meaningful commit messages.
Build the project before pushing.
Keep pull requests focused and small.
Update documentation whenever necessary.
Follow semantic versioning rules.
Do not commit generated files.
Review code before merging.
Contact

For project-related questions, contact the MetroRide development team.

Thank you for contributing to MetroRide-Java-API.