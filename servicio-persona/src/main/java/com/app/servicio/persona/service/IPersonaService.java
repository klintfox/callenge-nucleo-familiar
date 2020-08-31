package com.app.servicio.persona.service;

import java.util.List;

import com.serviciopersonacommon.entity.Persona;

public interface IPersonaService {

	public List<Persona> findAll();

	public Persona findById(Long id);

	public Persona save(Persona persona);
	
	public Persona update(Persona persona, Long id);

	public void deleteById(Long id);
}
