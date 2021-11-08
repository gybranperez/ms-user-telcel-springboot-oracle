package mx.com.telcel.userrol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.telcel.userrol.bo.impl.UsuarioBo;
import mx.com.telcel.userrol.dao.IUsuarioDao;
import mx.com.telcel.userrol.dto.ResponseDetalleUsuario;
import mx.com.telcel.userrol.entity.Usuario;

@Service
public class UsuarioService {
	@Autowired
	IUsuarioDao usuarioDao;
	@Autowired
	UsuarioBo usuarioBo;
	public List<Usuario> getAllUsers(){
		return this.usuarioDao.findAll();
	}
	public ResponseDetalleUsuario getUserDetail(Integer idUsuario) {
		return this.usuarioBo.getUserDetail(idUsuario);
	}
	public void deleteUser(Integer idUsuario) {
		this.usuarioDao.deleteById(idUsuario);
	}
	public Usuario addUser(Usuario usuario) {
		return this.usuarioDao.save(usuario);
	}
	public Usuario updateUser(Integer idUsuario,Usuario usuarioAtualizado) {
		Optional<Usuario> opt = this.usuarioDao.findById(idUsuario);
		Usuario usuario = opt.get();
		usuario.setNombre(usuarioAtualizado.getNombre());
		usuario.setApellidoPaterno(usuarioAtualizado.getApellidoPaterno());
		usuario.setApellidoMaterno(usuarioAtualizado.getApellidoMaterno());
		usuario.setIdRol(usuarioAtualizado.getIdRol());
		return this.usuarioDao.save(usuario);
	}
	public List<Usuario> getUsersByName(String nombre){
		return this.usuarioDao.findByNombre(nombre);
	}
}
