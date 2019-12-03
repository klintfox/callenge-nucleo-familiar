package com.app.servicio.persona.dao;

import org.springframework.data.repository.CrudRepository;

import com.serviciopersonacommon.entity.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>{

}
