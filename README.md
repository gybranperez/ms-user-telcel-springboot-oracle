**REST API Usuarios y Roles**
----
  Este proyecto tiene el propósito de demostrar el funcionamiento de un API que lista usuarios y roles.

* **URL**

  <_host_>:9091/usuario/all         `GET`       getAllUsers
  <_host_>:9091/usuario/<_id_>      `GET`       getUserDetail
  <_host_>:9091/usuario/<_id_>      `DELETE`    deleteUser
  <_host_>:9091/usuario/add         `POST`      createUser
  <_host_>:9091/usuario/add         `PUT`       updateUser
  <_host_>:9091/usuario/search?nombre=<_host_>  `GET`  searchUserByName

  <_host_>:9091/usuario/all         `GET`       getAllRoles
  <_host_>:9091/usuario/<_id_>      `GET`       getRole
  <_host_>:9091/usuario/<_id_>      `DELETE`    deleteRole
  <_host_>:9091/usuario/add         `POST`      createRole
  <_host_>:9091/usuario/add         `PUT`       updateRole
  <_host_>:9091/usuario/search?nombre=<_host_>  `GET`  searchRoleByName

    Donde:
   _id_`=[Integer]`
   _nombre_`=[String]`

   El la sección mencionada anteriormente se mostraron las peticiones a las que da respuesta el api, las cuales se presentan en este video.

    Author: gybranperez