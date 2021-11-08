package mx.com.telcel.userrol.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.userrol.entity.Usuario;

@Repository
public interface IUsuarioDao extends JpaRepository<Usuario, Integer>{
    List<Usuario> findByNombre(String nombre);
}
