# adea
ExamenPractico


1. Crear una BBDD en Postgre

`CREATE DATABASE adea
WITH
OWNER = postgres
ENCODING = 'UTF8'
LC_COLLATE = 'Spanish_Mexico.1252'
LC_CTYPE = 'Spanish_Mexico.1252'
TABLESPACE = pg_default
CONNECTION LIMIT = -1;`

`COMMENT ON DATABASE adea
IS 'ExamenPractica';`

2. Crear un usuario:

`CREATE ROLE adea_app WITH
LOGIN
NOSUPERUSER
NOCREATEDB
NOCREATEROLE
INHERIT
NOREPLICATION
CONNECTION LIMIT -1
PASSWORD 'xxxxxx';`

`GRANT postgres TO adea_app;`

`ALTER ROLE adea_app IN DATABASE adea SET role TO 'adea_rol';`

3. Crear la tabla:

`CREATE TABLE  usuarios (
"login" VARCHAR(20) NOT NULL,
"password" VARCHAR(100) NOT NULL,
"nombre" VARCHAR(50) NOT NULL,
"cliente" NUMERIC(5) NOT NULL,
"email" VARCHAR(50) NULL,
"fecha_alta" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
"fecha_baja" TIMESTAMP NULL,
"status" CHAR (1) NOT NULL DEFAULT 'A',
"intentos" NUMERIC (1) NOT NULL DEFAULT 0,
"fecha_revocado" TIMESTAMP NULL,
"fecha_vigencia" TIMESTAMP NULL,
"no_acceso" INT NULL,
"apellido_paterno" VARCHAR(50) NULL,
"apellido_materno" VARCHAR(50) NULL,
"area" NUMERIC (4) NULL,
"fecha_modificacion" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP + INTERVAL '1 MONTH',
PRIMARY KEY ("login"));`

4. Agregar la base y el usuario en el archivo de configuracion:
[archivo-confituacion](./src/main/resources/application-dev.properties)
   - spring.datasource.url=jdbc:postgresql://localhost:5432/colocar-tu-bbdd
   - spring.datasource.username=colocar-tu-usuario-de-bbdd
   - spring.datasource.password=colocar-tu-password-de-bbdd


5. Al levantar la aplicacion de forma local entrar a la siguiente 
[URL](http://localhost:8080/adea/examen)

