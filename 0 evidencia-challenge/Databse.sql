create database nexos;
use nexos;

create table persona (
    persona_id integer primary key AUTO_INCREMENT,
    nombre varchar(25),
    apellido_paterno varchar(25),
    apellido_materno varchar(25),
    fecha_nacimiento date,    
    active char(1)
);

create table pariente(
	pariente_id integer primary key AUTO_INCREMENT,
    persona_id integer,
    nombre varchar(25), 
    apellido_paterno varchar(25),
    apellido_materno varchar(25), 
    parentesco_id integer,
    active char(1)
);

create table tipo_parentesco(
    parentesco_id integer primary key AUTO_INCREMENT,
    descripcion varchar (25),
    active char(1)
);

/** Data de prueba */
 /* Inserts de la tabla persona*/
 insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento,active) values('Klint','roman','montes','1987-02-06',1);
 insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento,active) values('vanessa','salcedo','weeber','1993-06-24',1);
 
 /* Inserts de la tabla tipo_parentesco*/
 insert into tipo_parentesco(descripcion, active) values('Padre',1);
 insert into tipo_parentesco(descripcion, active) values('Madre',1);
 insert into tipo_parentesco(descripcion, active) values('Abuelo',1);
 insert into tipo_parentesco(descripcion, active) values('Abuela',1);
 insert into tipo_parentesco(descripcion, active) values('Tio',1);
 insert into tipo_parentesco(descripcion, active) values('Hermano',1);
 insert into tipo_parentesco(descripcion, active) values('Hermana',1);
 insert into tipo_parentesco(descripcion, active) values('Sobrino',1);
 insert into tipo_parentesco(descripcion, active) values('Sobrina',1);
 insert into tipo_parentesco(descripcion, active) values('Primo',1);
 insert into tipo_parentesco(descripcion, active) values('Prima',1);
 insert into tipo_parentesco(descripcion, active) values('Esposo',1);
 insert into tipo_parentesco(descripcion, active) values('Esposa',1);
 
 
 /* Inserts de la tabla pariente*/
 insert into  pariente (persona_id, nombre, apellido_paterno, apellido_materno, parentesco_id, active)  values (1,'Fitz','Roman','Pedraza',1,1);
 insert into  pariente (persona_id, nombre, apellido_paterno, apellido_materno, parentesco_id, active)  values (1,'Hortencia','Montes','Serrano',2,1);
 insert into  pariente (persona_id, nombre, apellido_paterno, apellido_materno, parentesco_id, active)  values (1,'Vanessa','Salcedo','Webber',3,1);
 insert into  pariente (persona_id, nombre, apellido_paterno, apellido_materno, parentesco_id, active)  values (1,'Kirsshen','Roman','Montes',7,1);
 insert into  pariente (persona_id, nombre, apellido_paterno, apellido_materno, parentesco_id, active)  values (2,'Ana','Weeber','Ruiz',2,1);
 
 
 /* select */
 select * From persona;
 select * from tipo_parentesco;
 select * from pariente;

 