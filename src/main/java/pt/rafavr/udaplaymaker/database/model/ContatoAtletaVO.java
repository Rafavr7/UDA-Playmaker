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
import javax.persistence.UniqueConstraint;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Contatos_Atletas",
		uniqueConstraints = @UniqueConstraint(columnNames = {"atleta_id", "relacao_atleta"})
)
@EntityListeners(AuditingEntityListener.class)
public class ContatoAtletaVO extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contato_id")
	private int contatoId;
	
	@Column(name = "relacao_atleta", nullable = false, length = 50)
	private String relacaoAtleta;
	
	@Column(name = "telefone_fixo", length = 13)
	private String telefoneFixo;
	
	@Column(name = "telemovel", nullable = false, length = 13)
	private String telemovel;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "morada", length = 100)
	private String morada;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "atleta_id", nullable = false)
	private AtletaVO atleta;
	
	
	public ContatoAtletaVO() {}

	public int getContatoId() {
		return contatoId;
	}

	public String getRelacaoAtleta() {
		return relacaoAtleta;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public String getTelemovel() {
		return telemovel;
	}

	public String getEmail() {
		return email;
	}

	public String getMorada() {
		return morada;
	}

	public AtletaVO getAtleta() {
		return atleta;
	}

	public void setContatoId(int contatoId) {
		this.contatoId = contatoId;
	}

	public void setRelacaoAtleta(String relacaoAtleta) {
		this.relacaoAtleta = relacaoAtleta;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public void setTelemovel(String telemovel) {
		this.telemovel = telemovel;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public void setAtleta(AtletaVO atleta) {
		this.atleta = atleta;
	}
	
}
