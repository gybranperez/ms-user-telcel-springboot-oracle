package mx.com.telcel.userrol.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.userrol.entity.Rol;

@Repository
public interface IRolDao extends JpaRepository<Rol, Integer>{
	List<Rol> findByNombre(String nombre);
}
