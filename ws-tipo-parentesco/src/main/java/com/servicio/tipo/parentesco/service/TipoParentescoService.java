package com.servicio.tipo.parentesco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.servicio.tipo.parentesco.dao.TipoParentescoDao;
import com.serviciotipoparentescocommons.entity.TipoParentesco;

@Service
public class TipoParentescoService implements ITipoParentesco {

	@Autowired
	private TipoParentescoDao tipoParentescoDao;

	@Override
	@Transactional(readOnly = true)
	public List<TipoParentesco> findAll() {
		return (List<TipoParentesco>) tipoParentescoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public TipoParentesco findById(Long id) {
		return tipoParentescoDao.findById(id).orElse(null);
	}

	@Override
	public TipoParentesco save(TipoParentesco tipoParentesco) {
		return tipoParentescoDao.save(tipoParentesco);
	}

	@Override
	public void deleteById(Long id) {
		tipoParentescoDao.deleteById(id);
	}

}
