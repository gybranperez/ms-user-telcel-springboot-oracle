package mx.com.telcel.userrol.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import mx.com.telcel.userrol.entity.Rol;
import mx.com.telcel.userrol.entity.Usuario;

@AllArgsConstructor
@Getter
@Setter
public class ResponseDetalleUsuario{
	private int id;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private List<Rol> roles;
	
	public ResponseDetalleUsuario(Usuario usuario, List<Rol> roles) {
		this.id = usuario.getId();
		this.nombre = usuario.getNombre();
		this.apellidoPaterno = usuario.getApellidoPaterno();
		this.apellidoMaterno = usuario.getApellidoMaterno();
		this.roles = roles;
	}

	public ResponseDetalleUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
