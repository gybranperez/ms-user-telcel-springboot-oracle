-- disable FK constraints
ALTER TABLE usuario DISABLE CONSTRAINT fk_usuario_rol;
-- Inserting ROLes
REM INSERTING into GYBRAN.ROL
SET DEFINE OFF;
Insert into GYBRAN.ROL (NOMBRE) values ('ADMIN');
Insert into GYBRAN.ROL (NOMBRE) values ('REGULAR');
Insert into GYBRAN.ROL (NOMBRE) values ('VIEWER');
-- Inserting USUARIOs
REM INSERTING into GYBRAN.USUARIO
SET DEFINE OFF;
Insert into GYBRAN.USUARIO (NOMBRE,A_PATERNO,A_MATERNO,ID_TROL) values ('Eduardo','Ramirez','Perez',1);
Insert into GYBRAN.USUARIO (NOMBRE,A_PATERNO,A_MATERNO,ID_TROL) values ('Melisa','Olivarez','Castillo',2);
Insert into GYBRAN.USUARIO (NOMBRE,A_PATERNO,A_MATERNO,ID_TROL) values ('Daniel','Torres','Portales',1);
Insert into GYBRAN.USUARIO (NOMBRE,A_PATERNO,A_MATERNO,ID_TROL) values ('Denisse','Gutierrez','Rosales',3);
Insert into GYBRAN.USUARIO (NOMBRE,A_PATERNO,A_MATERNO,ID_TROL) values ('Alexa','Lima','Rodriguez',2);

-- enable FK constraints
ALTER TABLE usuario ENABLE CONSTRAINT fk_usuario_rol;