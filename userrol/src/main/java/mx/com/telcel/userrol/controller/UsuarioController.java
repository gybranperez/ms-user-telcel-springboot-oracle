package mx.com.telcel.userrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.com.telcel.userrol.dto.ResponseDetalleUsuario;
import mx.com.telcel.userrol.entity.Usuario;
import mx.com.telcel.userrol.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<Usuario>> getAllUsers(){
		ResponseEntity<List<Usuario>> response = null;
		try {
			List<Usuario> res = this.usuarioService.getAllUsers();
			response = new ResponseEntity<List<Usuario>>(res,HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<List<Usuario>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<ResponseDetalleUsuario> getUserDetail(@PathVariable Integer id) {
		ResponseEntity<ResponseDetalleUsuario> response = null;
		try {
			ResponseDetalleUsuario res = this.usuarioService.getUserDetail(id);
			response = new ResponseEntity<ResponseDetalleUsuario>(res,HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<ResponseDetalleUsuario>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody()
	public ResponseEntity<Usuario> addUser(@RequestBody Usuario usuario) {
		ResponseEntity<Usuario> response = null;
		try {
			Usuario usuarioRegistrado = this.usuarioService.addUser(usuario);
			response = new ResponseEntity<Usuario>(usuarioRegistrado,HttpStatus.OK);
		} catch (IllegalArgumentException e) {
			response = new ResponseEntity<Usuario>(HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Usuario> updateUser(@PathVariable Integer id,@RequestBody Usuario usuario) {
		ResponseEntity<Usuario> response = null;
		try {
			Usuario res = this.usuarioService.updateUser(id, usuario);
			response = new ResponseEntity<Usuario>(res,HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<Usuario>(HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Usuario> updateUser(@PathVariable Integer id) {
		ResponseEntity<Usuario> response = null;
		try {
			this.usuarioService.deleteUser(id);
			response = new ResponseEntity<Usuario>(HttpStatus.OK);
		} catch (IllegalArgumentException e) {
			response = new ResponseEntity<Usuario>(HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public ResponseEntity<List<Usuario>> getUsersByName(@RequestParam String nombre){
		ResponseEntity<List<Usuario>> response = null;
		try {
			List<Usuario> res = this.usuarioService.getUsersByName(nombre);
			response = new ResponseEntity<List<Usuario>>(res,HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<List<Usuario>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
}
