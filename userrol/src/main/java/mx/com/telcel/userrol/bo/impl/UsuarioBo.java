package mx.com.telcel.userrol.bo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.telcel.userrol.bo.IUsuarioBo;
import mx.com.telcel.userrol.dao.IRolDao;
import mx.com.telcel.userrol.dao.IUsuarioDao;
import mx.com.telcel.userrol.dto.ResponseDetalleUsuario;
import mx.com.telcel.userrol.entity.Rol;
import mx.com.telcel.userrol.entity.Usuario;

@Service
public class UsuarioBo implements IUsuarioBo{
	@Autowired
	IUsuarioDao usuarioDao;
	@Autowired
	IRolDao rolDao;
	public ResponseDetalleUsuario getUserDetail(Integer idUsuario){
		Usuario usuario = this.usuarioDao.findById(idUsuario).get();
		List<Rol> roles = new ArrayList<>();
		if(usuario != null) {
			Rol rol = this.rolDao.findById(usuario.getIdRol()).get();
			roles.add(rol);
		}
		return new ResponseDetalleUsuario(usuario, roles);
	}
}
