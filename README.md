# OrangeHrmLive

OrangeHrmLive es un proyecto de automatización de pruebas utilizando Java 1.8, Selenium, JUnit, y Cucumber. Este es un ejercicio demo cuyo propósito es automatizar pruebas funcionales para la aplicación OrangeHRM.

## Requisitos Previos

- Java 1.8
- Maven
- IntelliJ IDEA Community Edition 2024.1.1

## Configuración del Entorno

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/LucasYoris/OrangeHrmLive.git

# Descripción de Carpetas y Archivos

- **.idea**: Configuraciones del proyecto para IntelliJ IDEA.

- **cucumber-reports**: Carpeta donde se generan los reportes de Cucumber.

- **src/test/java**: Contiene el código fuente de las pruebas.

- **features**: Archivos `.feature` que contienen los escenarios de prueba en Gherkin.

- **pom**: Contiene las páginas de objetos (Page Object Models) como `HomePage.java` y `LoginPage.java`.

- **runner**: Contiene la clase `Testrunner.java` y el manejador de navegadores.

- **seleniumgluecode**: Contiene el código de pegamento (Glue code) de Cucumber, incluyendo los pasos de las pruebas.

- **utils**: Clases utilitarias como `Configuration.java`, `RandomNumbers.java`, y `WaitUntil.java`.

## Reportes

Los reportes de las pruebas se generan en la carpeta `cucumber-reports`. Se está utilizando **Cucumber Extent Report** para generar reportes detallados y visualmente atractivos.
