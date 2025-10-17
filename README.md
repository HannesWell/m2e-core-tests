# M2E Core Tests

This repository contains the test suite for [Eclipse M2E (Maven Integration for Eclipse)](https://projects.eclipse.org/projects/technology.m2e), the Maven integration plugin for Eclipse IDE.

## About This Repository

M2E Core Tests is a dedicated test repository that houses comprehensive integration and unit tests for the M2E project. These tests validate Maven project configuration, dependency resolution, lifecycle mapping, build integration, and other critical features of the Maven Eclipse plugin.

The test module (`org.eclipse.m2e.tests`) provides extensive coverage for:
- Maven project import and configuration
- Dependency management and resolution
- Build lifecycle execution
- Workspace synchronization
- JDT (Java Development Tools) integration
- Maven archetype support
- Plugin configuration and extensions
- Settings and preferences management

## Repository History

This repository was forked from its historical location to the Eclipse M2E organization as part of organizational consolidation and IP review processes. The fork was created following the Eclipse Foundation IP Lab review documented in [GitLab issue #19526](https://gitlab.eclipse.org/eclipsefdn/emo-team/iplab/-/issues/19526).

### Relationship to M2E Core

This repository is designed to work as a Maven module under the main [m2e-core](https://github.com/eclipse-m2e/m2e-core) parent project. The `pom.xml` declares:
```xml
<parent>
  <groupId>org.eclipse.m2e</groupId>
  <artifactId>m2e-core</artifactId>
  <version>2.1.0-SNAPSHOT</version>
</parent>
```

While this repository can exist independently for test development and CI/CD purposes, it is intended to be built as part of the complete M2E build process.

## Building

This project uses Maven with Tycho for building Eclipse plugins and tests:

```bash
mvn clean verify
```

The tests require:
- Java 21 or later
- Maven 3.6 or later
- Eclipse Tycho build infrastructure

## Contributing

Contributions are welcome! This project follows the Eclipse Development Process and contribution guidelines. Please refer to the main [m2e-core Contributing Guide](https://github.com/eclipse-m2e/m2e-core/blob/master/CONTRIBUTING.md) for detailed information on:
- Setting up your development environment
- Code style and conventions
- Submitting pull requests
- Eclipse Contributor Agreement requirements

## License

This project is licensed under the Eclipse Public License 2.0 (EPL-2.0). See the [Eclipse Foundation License Information](https://www.eclipse.org/legal/epl-2.0/) for details.

## Links

- **Main M2E Project**: https://github.com/eclipse-m2e/m2e-core
- **Eclipse Project Page**: https://projects.eclipse.org/projects/technology.m2e
- **Issue Tracker**: https://github.com/eclipse-m2e/m2e-core/issues
- **Eclipse Marketplace**: https://marketplace.eclipse.org/content/maven-integration-eclipse-m2e

## Support

For questions, issues, or discussions about M2E:
- Report bugs in the [m2e-core issue tracker](https://github.com/eclipse-m2e/m2e-core/issues)
- Ask questions on [Stack Overflow](https://stackoverflow.com/questions/tagged/m2e) using the `m2e` tag
- Join discussions in the Eclipse community forums
