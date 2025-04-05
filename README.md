# Emprende UdeA - Backend

Este repositorio contiene el backend del proyecto **Emprende UdeA**, un sistema web que sirve como una vitrina para los emprendimientos de la Universidad de Antioquia. Este backend expone servicios REST que permiten registrar, visualizar y gestionar información de usuarios y negocios registrados.

👉 Repositorio del frontend: [UdeAEmprende_frontend](https://github.com/SamKarsa/UdeAEmprende_frontend)

> ⚠️ **Nota:** Este backend debe estar corriendo antes de iniciar el frontend, ya que es necesario para que las peticiones del cliente se comuniquen correctamente con la base de datos.

---

## 🧰 Tecnologías utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Web**
- **Spring Security**
- **Lombok**
- **MySQL Driver**

---

## ⚙️ Configuración del proyecto

Antes de ejecutar el proyecto, debes tener:

1. **Java JDK 17** o superior instalado.
2. **MySQL** en funcionamiento y con una base de datos vacía creada.
3. **VS Code** (o IDE de tu preferencia) con las siguientes extensiones recomendadas:
   - Extension Pack for Java
   - Spring Boot Extension Pack

---

## 🗂 Configuración del archivo `application.properties`

Debes configurar el archivo `src/main/resources/application.properties` con los siguientes datos:

```properties
spring.application.name=NombreDeTuApp
spring.datasource.url=jdbc:mysql://localhost:3306/${DB_NAME}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASS}

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

> 📌 Nota: El sistema no cuenta con autenticación JWT o sesiones. Todos los endpoints son públicos por ahora.

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

## 📦 Datos de prueba (opcional)


---

## 👥 Autores

- [**Samuel López Marín**](https://github.com/SamKarsa)  
- [**Alexander Osorio Trespalacios**](https://github.com/AlexOsorio756)  

Ambos desarrolladores participaron activamente en el diseño y desarrollo del **frontend** y **backend** del sistema Emprende UdeA.

