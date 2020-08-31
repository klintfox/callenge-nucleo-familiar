package com.app.servicio.pariente.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.serviciopersonacommon.entity.Pariente;

public interface ParienteDao  extends CrudRepository<Pariente, Long>{

	@Query(value = " select * From pariente where persona_id = ?1 ", nativeQuery = true)
	List<Pariente> findAllByPersonaId(Long personaId);

//	  @Query(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?1", nativeQuery = true)
//	  User findByEmailAddress(String emailAddress);
}