package com.app.servicio.persona.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.servicio.persona.service.IPersonaService;
import com.serviciopersonacommon.entity.Persona;

@RestController
@RequestMapping("/persona")
public class PersonaController {

	public static Logger log = LoggerFactory.getLogger(PersonaController.class);

	@Autowired
	private IPersonaService personaService;

	@GetMapping("/listar")
	public List<Persona> listar() {
		return personaService.findAll();
	}

	@GetMapping("/ver/{id}")
	public Persona detalle(@PathVariable Long id) throws Exception {
		return personaService.findById(id);
	}

	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona crear(@RequestBody Persona persona) {
		return personaService.save(persona);
	}

	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona editar(@RequestBody Persona persona, @PathVariable Long id) {
		return personaService.update(persona, id);
	}

	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		personaService.deleteById(id);
	}
}