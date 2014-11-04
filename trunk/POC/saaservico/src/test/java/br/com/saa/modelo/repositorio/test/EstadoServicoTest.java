package br.com.saa.modelo.repositorio.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.saa.modelo.entidade.Estado;
import br.com.saa.servico.EstadoServico;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/applicationContextServicoSaa.xml")
// @ContextConfiguration(locations="classpath:META-INF/test-context.xml")
// @Ignore
public class EstadoServicoTest {

	@Autowired
	EstadoServico repository;

	@Test
	public void test() {
		Estado estado = new Estado();
		estado.setNome("Par�araaww");
		estado.setUf("PA");

		repository.save(estado);

		// Estado dbestado = repository.findOne(estado.getId());
		// assertNotNull(dbestado);
		// System.out.println(dbestado.getNome());
	}

}