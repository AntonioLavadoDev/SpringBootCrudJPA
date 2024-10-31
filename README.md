# Spring Boot CRUD Application with JPA and Java Bean Validation

Este proyecto es una aplicación CRUD desarrollada con Spring Boot y JPA que implementa validaciones de Java Bean para garantizar la integridad de los datos. El objetivo de esta aplicación es proporcionar una estructura básica de un sistema CRUD (Crear, Leer, Actualizar, Eliminar) utilizando las mejores prácticas en el uso de anotaciones y validaciones.

## Características

- **CRUD Completo**: Implementación de las operaciones básicas (Crear, Leer, Actualizar y Eliminar) sobre una entidad en la base de datos.
- **Java Bean Validation**: Uso de anotaciones de validación como `@NotNull`, `@Size`, `@Email`, entre otras, para validar los datos a nivel de modelo.
- **Spring Boot y JPA**: Integración con JPA para realizar operaciones de persistencia en la base de datos.
- **Arquitectura MVC**: Organización en controladores, servicios y repositorios para una clara separación de responsabilidades.

## Tecnologías Utilizadas

- **Spring Boot** - 3.x
- **Java** - 17
- **Spring Data JPA**
- **Java Bean Validation** (JSR 380)
- **H2 Database** (o cualquier base de datos de tu elección, yo usé MySQLWorkbench)
- **Maven**

## Requisitos Previos

- Java 17 o superior
- Maven 3.8+
- (Opcional) MySQL o cualquier otra base de datos de producción

## Configuración del Proyecto

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/springbootcrudjpa.git
   cd springbootcrudjpa


Configurar la conexión a la base de datos en el archivo application.properties o en variables de entorno:
spring.datasource.url=jdbc:mysql://localhost:3306/tu_basededatos
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA
spring.jpa.hibernate.ddl-auto=update

Ejecutar la aplicación:
mvn spring-boot:run

