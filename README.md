# Emprende UdeA - Backend

Este repositorio contiene el backend del proyecto **Emprende UdeA**, un sistema web que sirve como una vitrina para los emprendimientos de la Universidad de Antioquia. Este backend expone servicios REST que permiten registrar, visualizar y gestionar información de usuarios y negocios registrados.

👉 Repositorio del frontend: [UdeAEmprende_frontend](https://github.com/SamKarsa/UdeAEmprende_frontend)


> ⚠️ **Nota:** Este backend debe estar corriendo antes de iniciar el frontend, ya que es necesario para que las peticiones del cliente se comuniquen correctamente con la base de datos.

---

## 🧰 Tecnologías utilizadas

[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
[![Java 17](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/projects/jdk/17/)
[![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Web**
- **Spring Security**
- **Lombok**
- **MySQL Driver**

---

## ⚙️ Configuración del proyecto

### 📋 Requisitos Previos

- [JDK 17+](https://adoptium.net/)
- [MySQL 8+](https://dev.mysql.com/downloads/)
- [Maven 3.8+](https://maven.apache.org/)
- IDE recomendado: [VS Code](https://code.visualstudio.com/) con:
  - Extension Pack for Java
  - Spring Boot Extension Pack

---

## 📦 Datos de prueba (opcional)

Si deseas cargar la base de datos de prueba incluida en este proyecto, sigue los siguientes pasos:

🛠️ 1. Crear la base de datos
Abre MySQL desde consola (CMD o Workbench) y ejecuta:

```Bash
CREATE DATABASE emprendimientosudea;
```

2. Abrir la terminal y ubicarse en la carpeta de MySQL
   
```Bash
cd "C:\Program Files\MySQL\MySQL Server 8.0\bin"
```

📥 3. Importar el archivo SQL
Ejecuta el siguiente comando (ajusta la ruta al proyecto si es necesario):

   
```Bash
mysql -u root -p emprendimientosudea < "ruta\a\tu\proyecto\UdeAEmprende_backend\BD\bd.sql"
```
Example:
```Bash
mysql -u root -p emprendimientosudea < "C:\Users\alex\Documents\UdeAEmprende_backend\BD\bd.sql"
```

✅ Resultado
Esto cargará automáticamente todas las tablas y datos necesarios para usar el proyecto.

---
## 🗂 Configuración del archivo `application.properties`

Debes configurar el archivo `src/main/resources/application.properties` con los siguientes datos:

```properties
spring.application.name=emprendimientosudea <-- Aqui va el nombre de la base de datos
spring.datasource.url=jdbc:mysql://localhost:3306/emprendimientosudea
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> 📝 Nota: No necesitas crear las tablas manualmente, el sistema las generará automáticamente con base en las entidades JPA definidas en el código.

---

🔁 Endpoints principales
El backend expone múltiples endpoints REST para gestionar diferentes recursos. Algunos de los más importantes son:

GET /api/business - Lista todos los emprendimientos

POST /api/business - Crea un nuevo emprendimiento

GET /api/user - Lista de usuarios

POST /api/user - Registro de usuarios

GET /api/personal-data - Datos personales

POST /api/business-data - Información de negocios

> 📌 Nota: Todos los endpoints son públicos actualmente (sin autenticación)
---

🚀 Ejecución del proyecto
Opción recomendada (desde VS Code):
Abre el proyecto en VS Code.

Asegúrate de tener las extensiones recomendadas instaladas.

Haz clic en el botón "Run" o usa la paleta de comandos para ejecutar Spring Boot en modo debug o run.

### Opción desde consola (si usas Maven):

```bash
./mvnw spring-boot:run
```

> 🧪 Revisa que la conexión con la base de datos sea correcta antes de correr el proyecto.

---

## 👥 Autores

- [**Samuel López Marín**](https://github.com/SamKarsa)  
- [**Alexander Osorio Trespalacios**](https://github.com/AlexOsorio756)  

Ambos desarrolladores participaron activamente en el diseño y desarrollo del **frontend** y **backend** del sistema Emprende UdeA.

