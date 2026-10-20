# QA Automation Demo - SauceDemo 🚀

Este proyecto de automatización de pruebas **End-to-End (E2E)** está diseñado para probar la aplicación web de demostración [SauceDemo](https://www.saucedemo.com/).

Fue desarrollado como parte de mi portafolio profesional para demostrar habilidades en automatización de pruebas web, aplicando buenas prácticas de desarrollo y diseño de frameworks de testing.

## 🛠️ Tecnologías utilizadas

- **Java 21** — Lenguaje de programación.
- **Selenium WebDriver** — Automatización e interacción con el navegador.
- **Cucumber (BDD)** — Definición de escenarios de prueba utilizando Gherkin (`Given`, `When`, `Then`).
- **JUnit 5** — Ejecución y organización de pruebas.
- **Maven** — Gestión de dependencias y ejecución de pruebas.
- **Page Object Model (POM)** — Patrón de diseño para mejorar la mantenibilidad y reutilización del código.
- **WebDriverManager** — Gestión automática de los drivers del navegador.
- **GitHub Actions** — Integración continua (CI) para ejecutar las pruebas automáticamente.

## 📂 Estructura del proyecto

```text
qa-automation-demo/
├── pom.xml
├── README.md
└── src/
    └── test/
        ├── java/
        │   ├── pages/       # Page Objects (LoginPage, ProductsPage)
        │   ├── runners/     # Configuración del ejecutor de pruebas
        │   ├── steps/       # Step Definitions de Cucumber
        │   └── support/     # Hooks y configuración del WebDriver
        └── resources/
            └── features/    # Escenarios de prueba escritos en Gherkin
```

## 🚀 Escenarios automatizados

El framework cubre los siguientes flujos funcionales:

### 1. Inicio de sesión (Login)

- Inicio de sesión exitoso con credenciales válidas.
- Validación de inicio de sesión fallido con una contraseña incorrecta.

### 2. Productos y carrito de compras

- Agregar un producto al carrito y validar el contador.
- Agregar múltiples productos y verificar que el contador se actualice correctamente.
- Reutilización de pasos comunes mediante `Background` en Gherkin.

## ⚙️ Cómo ejecutar las pruebas localmente

### Prerrequisitos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- [Java JDK 21](https://adoptium.net/)
- [Apache Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)

### Instalación y ejecución

**1. Clonar el repositorio**

```bash
git clone https://github.com/OssielVelazquez/qa-automation-demo.git

**2. Entrar en el directorio del proyecto**

```bash
cd qa-automation-demo
```

**3. Ejecutar las pruebas**

```bash
mvn clean test
```

Maven descargará las dependencias necesarias y ejecutará la suite de pruebas automatizadas.

## 📊 Reportes de ejecución

El proyecto está configurado para generar un reporte HTML de Cucumber después de la ejecución de las pruebas.

Una vez finalizada la ejecución, el reporte estará disponible en:

```text
target/cucumber-reports/cucumber.html
```

> Nota: La ruta y la generación del reporte dependen de la configuración del proyecto y de los plugins de Maven utilizados.

## 🔄 Integración continua (CI)

El proyecto utiliza **GitHub Actions** para automatizar la ejecución de las pruebas.

El pipeline está diseñado para ejecutar las pruebas en un entorno de integración continua con Ubuntu y Java 21 cuando se realizan `push` o `pull requests` hacia la rama `main`.

Esto permite detectar errores de forma temprana y comprobar que los flujos automatizados sigan funcionando.

## 🎯 Objetivos del proyecto

- Aplicar buenas prácticas de automatización de pruebas E2E.
- Implementar el patrón Page Object Model.
- Diseñar escenarios de prueba legibles mediante BDD y Gherkin.
- Validar flujos críticos de una aplicación web.
- Integrar pruebas automatizadas en un pipeline de CI.
- Construir un portafolio práctico de QA Automation.

## 👨‍💻 Autor

**Ossiel Velázquez**

Desarrollador de software y QA Tester interesado en automatización de pruebas, calidad de software y mejora continua.

