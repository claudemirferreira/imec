package br.com.ss.controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import br.com.ss.model.entidade.Setor;
import br.com.ss.model.servico.Servico;
import br.com.ss.model.servico.SetorServico;

@ManagedBean
@SessionScoped
public class SetorControlador extends ControladorGenerico<Setor> {

	private static final long serialVersionUID = -6832271293709421841L;

	@ManagedProperty(value = "#{setorServicoImpl}")
	private SetorServico servico;

	private String nomeRelatorio = "empresa.jasper";

	@Override
	protected String getNomeRelatorioJasper() {
		return this.nomeRelatorio;
	}

	@Override
	public String getTituloRelatorio() {
		return "RELATÓRIO DE CURSO";
	}

	@Override
	protected Servico<Setor, Long> getService() {
		return this.servico;
	}

	public void setNomeRelatorio(String nomeRelatorio) {
		this.nomeRelatorio = nomeRelatorio;
	}

	public SetorServico getServico() {
		return servico;
	}

	public void setServico(SetorServico servico) {
		this.servico = servico;
	}

}