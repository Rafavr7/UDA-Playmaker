package pt.rafavr.udaplaymaker.database.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Distritos")
public class DistritoVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "distrito_id")
	private int distritoId;
	
	@Size(min = 3, max = 30)
	@Column(name = "nome", nullable = false, length = 30)
	private String nome;
	
	
	public DistritoVO() {}

	public int getDistritoId() {
		return distritoId;
	}

	public String getNome() {
		return nome;
	}

	public void setDistritoId(int distritoId) {
		this.distritoId = distritoId;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
