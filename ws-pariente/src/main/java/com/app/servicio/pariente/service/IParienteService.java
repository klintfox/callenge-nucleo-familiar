package com.app.servicio.pariente.service;

import java.util.List;

import com.serviciopersonacommon.entity.Pariente;

public interface IParienteService {

	public List<Pariente> findAll();
	
	public List<Pariente> findAllByPersonaId(Long personaId);
	
	public Pariente findById(Long id);

	public Pariente save(Pariente pariente, Long personaId);
	
	public Pariente update(Pariente pariente, Long id);

	public void deleteById(Long id);
}
