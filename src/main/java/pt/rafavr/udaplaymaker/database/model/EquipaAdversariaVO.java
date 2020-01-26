package pt.rafavr.udaplaymaker.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Equipas_Adversarias")
@EntityListeners(AuditingEntityListener.class)
public class EquipaAdversariaVO extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "equipa_id")
	private int equipaId;
	
	@NotNull
	@Size(min = 5, max = 60)
	@Column(name = "nome_equipa", nullable = false, length = 60)
	private String nomeEquipa;
	
	@Size(min = 5, max = 60)
	@Column(name = "freguesia", length = 60)
	private String freguesia;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "distrito_id")
	private DistritoVO distrito;
	
	
	public EquipaAdversariaVO() {}

	public int getEquipaId() {
		return equipaId;
	}

	public String getNomeEquipa() {
		return nomeEquipa;
	}

	public String getFreguesia() {
		return freguesia;
	}

	public DistritoVO getDistrito() {
		return distrito;
	}

	public void setEquipaId(int equipaId) {
		this.equipaId = equipaId;
	}

	public void setNomeEquipa(String nomeEquipa) {
		this.nomeEquipa = nomeEquipa;
	}

	public void setFreguesia(String freguesia) {
		this.freguesia = freguesia;
	}

	public void setDistrito(DistritoVO distrito) {
		this.distrito = distrito;
	}
}
