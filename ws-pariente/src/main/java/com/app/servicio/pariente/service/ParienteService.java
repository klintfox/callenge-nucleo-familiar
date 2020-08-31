package com.app.servicio.pariente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.servicio.pariente.dao.ParienteDao;
import com.serviciopersonacommon.entity.Pariente;

@Service
public class ParienteService implements IParienteService{

	@Autowired
	private ParienteDao parienteDao; 
	
	@Override
	@Transactional(readOnly = true)
	public List<Pariente> findAll() {		
		return (List<Pariente>) parienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Pariente> findAllByPersonaId(Long personaId) {		
		return parienteDao.findAllByPersonaId(personaId);
	}

	@Override
	@Transactional(readOnly = true)
	public Pariente findById(Long id) {		
		return parienteDao.findById(id).orElse(null);
	}

	@Override
	public Pariente save(Pariente pariente, Long personaId) {		
		pariente.setPersonaId(personaId);
		return parienteDao.save (pariente);
	}

	@Override
	public Pariente update(Pariente pariente, Long id) {
		Pariente parienteDb = parienteDao.findById(id).orElse(null);		
		parienteDb.setNombre(pariente.getNombre());
		parienteDb.setApellidoPaterno(pariente.getApellidoPaterno());
		parienteDb.setApellidoMaterno(pariente.getApellidoMaterno());
		parienteDb.setParentescoId(pariente.getParentescoId());
		parienteDb.setActive(pariente.getActive());
		return parienteDao.save(parienteDb);			
	}

	@Override
	public void deleteById(Long id) {		
		parienteDao.deleteById(id);
	}

}