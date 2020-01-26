package pt.rafavr.udaplaymaker.database.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Equipas_UDA")
@EntityListeners(AuditingEntityListener.class)
public class EquipaUdaVO extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "equipa_id")
	private int equipaId;
	
	@NotNull
	@Size(min = 5, max = 60)
	@Column(name = "nome_equipa", nullable = false, length = 60)
	private String nomeEquipa;
	
	@Column(name = "escalao")
	private Integer escalao;
	
	@ManyToMany
	@JoinTable(name = "EquipasUDA_Atletas",
			joinColumns = @JoinColumn(name = "atleta_id"),
			inverseJoinColumns = @JoinColumn(name = "equipa_id"))
	private Set<AtletaVO> atletas = new HashSet<>();
	
	
	public EquipaUdaVO() {}

	public int getEquipaId() {
		return equipaId;
	}

	public String getNomeEquipa() {
		return nomeEquipa;
	}

	public Integer getEscalao() {
		return escalao;
	}
	
	public Set<AtletaVO> getAtletas() {
		return atletas;
	}

	public void setEquipaId(int equipaId) {
		this.equipaId = equipaId;
	}

	public void setNomeEquipa(String nomeEquipa) {
		this.nomeEquipa = nomeEquipa;
	}

	public void setEscalao(Integer escalao) {
		this.escalao = escalao;
	}
	
	public void setAtletas(Set<AtletaVO> atletas) {
		this.atletas = atletas;
	}
}
