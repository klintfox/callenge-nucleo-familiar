package com.app.servicio.persona.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.servicio.persona.dao.PersonaDao;
import com.serviciopersonacommon.entity.Persona;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private PersonaDao personaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findById(Long id) {
		return personaDao.findById(id).orElse(null);
	}

	@Override
	public Persona save(Persona persona) {
		return personaDao.save(persona);
	}

	@Override
	public Persona update(Persona persona, Long id) {
		Persona personadb = personaDao.findById(id).orElse(null);
		personadb.setNombre(persona.getNombre());
		personadb.setApellidoPaterno(persona.getApellidoPaterno());
		personadb.setApellidoMaterno(persona.getApellidoMaterno());
		personadb.setFechaNacimiento(persona.getFechaNacimiento());
		return personaDao.save(personadb);
	}

	@Override
	public void deleteById(Long id) {
		personaDao.deleteById(id);
	}

}