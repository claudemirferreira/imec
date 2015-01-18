package br.fucapi.ads.modelo.dominio;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import flexjson.transformer.DateTransformer;

/**
 * The persistent class for the saa_sistema database table.
 * 
 */
@Entity
@Table(name = "ECM_TIPO_DOCUMENTO")
public class TipoDocumento extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 7516652276680517473L;

	@Id
	@GeneratedValue(generator = "SEQ_ECM_TIPO_DOCUMENTO", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "SEQ_ECM_TIPO_DOCUMENTO", name = "SEQ_ECM_TIPO_DOCUMENTO")
	@Column(name = "ID_ECM_TIPO_DOCUMENTO")
	private Long id;

	@Column(length = 30, nullable = false, unique = true)
	private String nome;

	@Column(length = 4, nullable = false, unique = true)
	private String sigla;
	
	private boolean possuiTarja;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public boolean isPossuiTarja() {
		return possuiTarja;
	}

	public void setPossuiTarja(boolean possuiTarja) {
		this.possuiTarja = possuiTarja;
	}

	public TipoDocumento(String nome) {
		super();
		this.nome = nome;
	}

	public TipoDocumento() {
		super();
	}
	
	public boolean equals(Object o) {
		if (o instanceof TipoDocumento && ((TipoDocumento) o).getId() == this.id)
			return true;
		else
			return false;
	}

	public static TipoDocumento fromJsonToObject(String json) {
		return new JSONDeserializer<TipoDocumento>().use(null,
				TipoDocumento.class).deserialize(json);
	}

	public String toJson() {
		return new JSONSerializer()
				.exclude("*.class")
				.transform(new DateTransformer("dd/MM/yyyy HH:mm:ss"),
						Date.class).serialize(this);
	}

	public static String toJsonArray(Collection<TipoDocumento> collection) {
		return new JSONSerializer().exclude("*.class").serialize(collection);
	}

}