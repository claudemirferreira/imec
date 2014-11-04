package br.com.saa.modelo.repositorio.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import br.com.saa.modelo.entidade.Estado;
import br.com.saa.modelo.repositorio.EstadoRepositorio;
import br.com.saa.modelo.repositorio.GenericRepositorioImpl;

@Repository
public class EstadoRepositorioImpl extends
		GenericRepositorioImpl<Estado, Serializable> implements
		EstadoRepositorio {

}
