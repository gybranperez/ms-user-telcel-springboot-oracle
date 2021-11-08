package mx.com.telcel.userrol.bo;

import mx.com.telcel.userrol.dto.ResponseDetalleUsuario;

public interface IUsuarioBo {
	public ResponseDetalleUsuario getUserDetail(Integer idUsuario);
}
