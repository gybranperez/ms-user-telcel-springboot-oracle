**REST API Usuarios y Roles**
----
  Este proyecto tiene el propósito de demostrar el funcionamiento de un API que lista usuarios y roles.

* **URL**

<_host_>:9091/
├── usuario/
│   ├── all                       `GET`         getAllUsers
│   ├── <_id_>                    `GET`         getUserDetail
│   ├── <_id_>                    `DELETE`      deleteUser
│   ├── add                       `POST`        createUser #Bodyparam tipo Usuario 
│   ├── <_id_>                    `PUT`         updateUser #Bodyparam tipo Usuario 
│   └── search?nombre=<_nombre_>  `GET`         searchUserByName
└── rol/
│   ├── all                       `GET`         getAllRoles
│   ├── <_id_>                    `GET`         getRole
│   ├── <_id_>                    `DELETE`      deleteRole
│   ├── add                       `POST`        createRole #Bodyparam tipo Rol 
│   ├── <_id_>                    `PUT`         updateRole #Bodyparam tipo Rol 
│   └── search?nombre=<_nombre_>  `GET`         searchRoleByName

Donde:
├─  _id_`=[Integer]`
└─  _nombre_`=[String]`

En la sección mencionada anteriormente se mostraron las peticiones a las que da respuesta el api, las cuales se presentan en este video.

***Author: gybranperez***