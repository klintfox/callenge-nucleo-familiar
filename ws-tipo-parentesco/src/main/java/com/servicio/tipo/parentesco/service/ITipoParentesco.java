package com.servicio.tipo.parentesco.service;

import java.util.List;

import com.serviciotipoparentescocommons.entity.TipoParentesco;

public interface ITipoParentesco {
	
	public List<TipoParentesco> findAll();
	
	public TipoParentesco findById(Long id);
	
	public TipoParentesco save(TipoParentesco tipoParentesco);
	
	public void deleteById(Long id);

}
