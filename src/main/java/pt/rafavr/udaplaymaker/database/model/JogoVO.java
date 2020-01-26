package pt.rafavr.udaplaymaker.database.model;

import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Jogos")
@EntityListeners(AuditingEntityListener.class)
public class JogoVO extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "jogo_id")
	private int jogoId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "equipa_uda_id", nullable = false)
	private EquipaUdaVO equipaUda;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "equipa_adversaria_id", nullable = false)
	private EquipaAdversariaVO equipaAdversaria;
	
	@NotNull
	@Column(name = "golos_uda", columnDefinition = "NUMERIC(2,0) DEFAULT 0")
	private int golosUda;
	
	@NotNull
	@Column(name = "golos_adversario", columnDefinition = "NUMERIC(2,0) DEFAULT 0")
	private int golosAdversario;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_jogo", nullable = false)
	private Date dataJogo;
	
	
	public JogoVO() {}

	public int getJogoId() {
		return jogoId;
	}


	public EquipaUdaVO getEquipaUda() {
		return equipaUda;
	}


	public EquipaAdversariaVO getEquipaAdversaria() {
		return equipaAdversaria;
	}


	public int getGolosUda() {
		return golosUda;
	}


	public int getGolosAdversario() {
		return golosAdversario;
	}


	public Date getDataJogo() {
		return dataJogo;
	}

	public void setJogoId(int jogoId) {
		this.jogoId = jogoId;
	}

	public void setEquipaUda(EquipaUdaVO equipaUda) {
		this.equipaUda = equipaUda;
	}

	public void setEquipaAdversaria(EquipaAdversariaVO equipaAdversaria) {
		this.equipaAdversaria = equipaAdversaria;
	}

	public void setGolosUda(int golosUda) {
		this.golosUda = golosUda;
	}

	public void setGolosAdversario(int golosAdversario) {
		this.golosAdversario = golosAdversario;
	}

	public void setDataJogo(Date dataJogo) {
		this.dataJogo = dataJogo;
	}
	
}
