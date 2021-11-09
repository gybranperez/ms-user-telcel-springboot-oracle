**REST API Usuarios y Roles**
----
  Este proyecto tiene el propósito de demostrar el funcionamiento de un API que lista usuarios y roles.

* **URL**
```
  <_host_>:9091/
  ├── usuario/
  │   ├── all                     `GET`         getAllUsers
  │   ├── {id}                    `GET`         getUserDetail
  │   ├── {id}                    `DELETE`      deleteUser
  │   ├── add                     `POST`        createUser #Bodyparam tipo Usuario 
  │   ├── {id}                    `PUT`         updateUser #Bodyparam tipo Usuario 
  │   └── search?nombre={nombre}  `GET`         searchUserByName
  └── rol/
      ├── all                     `GET`         getAllRoles
      ├── {id}                    `GET`         getRole
      ├── {id}                    `DELETE`      deleteRole
      ├── add                     `POST`        createRole #Bodyparam tipo Rol 
      ├── {id}                    `PUT`         updateRole #Bodyparam tipo Rol 
      └── search?nombre={nombre}  `GET`         searchRoleByName
```
Donde:
```
├─  {id}      =   [Integer]
└─  {nombre}  =   [String]
```
En la sección mencionada anteriormente se mostraron las peticiones a las que da respuesta el api, las cuales se presentan en este video.

***Author: gybranperez***