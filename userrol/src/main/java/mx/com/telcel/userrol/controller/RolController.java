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
import mx.com.telcel.userrol.entity.Rol;
import mx.com.telcel.userrol.entity.Usuario;
import mx.com.telcel.userrol.service.RolService;
import mx.com.telcel.userrol.service.UsuarioService;

@RestController
@RequestMapping("/rol")
public class RolController {
	@Autowired
	RolService rolService;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<Rol>> getAllRoles(){
		ResponseEntity<List<Rol>> response = null;
		try {
			List<Rol> res = this.rolService.getAllRoles();
			response = new ResponseEntity<List<Rol>>(res,HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<List<Rol>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Rol> getRol(@PathVariable Integer id) {
		ResponseEntity<Rol> response = null;
		try {
			Rol res = this.rolService.getRole(id);
			response = new ResponseEntity<Rol>(res,HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<Rol>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody()
	public ResponseEntity<Rol> addUser(@RequestBody Rol rol) {
		ResponseEntity<Rol> response = null;
		try {
			Rol rolRegistrado = this.rolService.addRole(rol);
			response = new ResponseEntity<Rol>(rolRegistrado,HttpStatus.OK);
		} catch (IllegalArgumentException e) {
			response = new ResponseEntity<Rol>(HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Rol> updateUser(@PathVariable Integer id,@RequestBody Rol rol) {
		ResponseEntity<Rol> response = null;
		try {
			Rol res = this.rolService.updateRole(id, rol);
			response = new ResponseEntity<Rol>(res,HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<Rol>(HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Rol> updateUser(@PathVariable Integer id) {
		ResponseEntity<Rol> response = null;
		try {
			this.rolService.deleteRole(id);
			response = new ResponseEntity<Rol>(HttpStatus.OK);
		} catch (IllegalArgumentException e) {
			response = new ResponseEntity<Rol>(HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public ResponseEntity<List<Rol>> getRoleByName(@RequestParam String nombre){
		ResponseEntity<List<Rol>> response = null;
		try {
			List<Rol> res = this.rolService.getRoleByName(nombre);
			response = new ResponseEntity<List<Rol>>(res,HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<List<Rol>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
}
