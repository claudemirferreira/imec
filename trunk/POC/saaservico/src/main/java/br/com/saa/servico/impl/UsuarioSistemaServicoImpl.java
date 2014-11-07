package br.com.saa.servico.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.saa.modelo.entidade.UsuarioSistema;
import br.com.saa.modelo.repositorio.GenericRepositorio;
import br.com.saa.modelo.repositorio.UsuarioSistemaRepositorio;
import br.com.saa.servico.UsuarioSistemaServico;

@Service
@Transactional
public class UsuarioSistemaServicoImpl extends
		GenericServico<UsuarioSistema, Long> implements UsuarioSistemaServico {

	private static final long serialVersionUID = 9126372622766341131L;

	@Autowired
	private UsuarioSistemaRepositorio repositorio;

	@Override
	protected GenericRepositorio<UsuarioSistema, Long> getRepositorio() {
		return repositorio;
	}
}