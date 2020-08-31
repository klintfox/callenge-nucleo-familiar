package com.app.servicio.pariente.controller;

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

import com.app.servicio.pariente.service.IParienteService;
import com.serviciopersonacommon.entity.Pariente;

@RestController
@RequestMapping("/pariente")
public class ParienteController {

	public static Logger log = LoggerFactory.getLogger(ParienteController.class);
	
	@Autowired
	private IParienteService parienteService;
	
	@GetMapping("/listar")
	public List<Pariente> listar() {
		return parienteService.findAll();
	}
	
	@GetMapping("/listar-by-persona-id/{personaId}")
	public List<Pariente> listarAllByPersona(@PathVariable Long personaId){
		return parienteService.findAllByPersonaId(personaId);
	}
	
	@GetMapping("/ver/{id}")
	public Pariente detalle(@PathVariable Long id) throws Exception {
		return parienteService.findById(id);
	}
	
	@PostMapping("/crear-pariente-by-persona-id/{personaId}")
	@ResponseStatus(HttpStatus.CREATED)
	public Pariente crear(@RequestBody Pariente pariente, @PathVariable Long personaId) {
		return parienteService.save(pariente, personaId);
	}
	
	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Pariente editar(@RequestBody Pariente pariente, @PathVariable Long id) {
		return parienteService.update(pariente, id);
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		parienteService.deleteById(id);
	}
}
