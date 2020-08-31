package com.servicio.tipo.parentesco.controller;

import java.util.List;
import java.util.stream.Collectors;

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

import com.servicio.tipo.parentesco.service.ITipoParentesco;
import com.serviciotipoparentescocommons.entity.TipoParentesco;

@RestController
@RequestMapping("/tipo-parentesco")
public class TipoParentescoController {
	
	public static Logger log = LoggerFactory.getLogger(TipoParentescoController.class);

	@Autowired
	private ITipoParentesco tipoParentescoService; 
	
	@GetMapping("/listar")
	public List<TipoParentesco> listar(){
		return tipoParentescoService.findAll().stream().collect(Collectors.toList());				
	}
	
	@GetMapping("/ver/{id}")
	public TipoParentesco detalle(@PathVariable Long id) throws Exception {
		TipoParentesco tipoParentesco = tipoParentescoService.findById(id);
		return tipoParentesco;
	}
	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public TipoParentesco crear(@RequestBody TipoParentesco tipoParentesco) {
		return tipoParentescoService.save(tipoParentesco);
	}
	
	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public TipoParentesco editar(@RequestBody TipoParentesco tipoParentesco, @PathVariable Long id) {
		TipoParentesco tipParentescoDb = tipoParentescoService.findById(id);
		tipParentescoDb.setDescripcion(tipoParentesco.getDescripcion());
		return tipParentescoDb;
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		tipoParentescoService.deleteById(id);
	}
}
