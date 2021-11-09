package mx.com.telcel.userrol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.telcel.userrol.dao.IRolDao;
import mx.com.telcel.userrol.dto.ResponseDetalleUsuario;
import mx.com.telcel.userrol.entity.Rol;
import mx.com.telcel.userrol.entity.Usuario;

@Service
public class RolService {
	@Autowired
	IRolDao rolDao;
	public List<Rol> getAllRoles(){
		return this.rolDao.findAll();
	}
	public Rol getRole(Integer idRol) {
		return this.rolDao.findById(idRol).get();
	}
	public void deleteRole(Integer idRol) {
		this.rolDao.deleteById(idRol);
	}
	public Rol addRole(Rol rol) {
		return this.rolDao.save(rol);
	}
	public Rol updateRole(Integer idRol,Rol rolActualizado) {
		Optional<Rol> opt = this.rolDao.findById(idRol);
		Rol rol = opt.get();
		rol.setNombre(rolActualizado.getNombre());
		return this.rolDao.save(rol);
	}
	public List<Rol> getRoleByName(String nombre){
		return this.rolDao.findByNombre(nombre);
	}
}
