package pt.rafavr.udaplaymaker.database.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import pt.rafavr.udaplaymaker.database.model.enums.PePreferido;

@Entity
@Table(name = "Atletas")
@EntityListeners(AuditingEntityListener.class)
public class AtletaVO extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "atleta_id")
	private int atletaId;
	
	@Column(name = "nome", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "apelido", nullable = false, length = 50)
	private String apelido;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_nascimento", nullable = false)
	private Date dataNascimento;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_entrada_uda")
	private Date dataEntradaUda;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "pe_preferido")
	private PePreferido pePreferido;
	
	@Column(name = "peso")
	private Double peso;
	
	@Column(name = "altura")
	private Double altura;
	
	@Column(name = "localidade_nascimento", length = 250)
	private String localidadeNascimento;
	
	@Column(name = "pais_nascimento", length = 50)
	private String paisNascimento;
	
	@OneToMany(mappedBy = "atleta", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<ContatoAtletaVO> contatos = new HashSet<>();
	
	
	public AtletaVO() {}

	public int getAtletaId() {
		return atletaId;
	}

	public String getNome() {
		return nome;
	}

	public String getApelido() {
		return apelido;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public Date getDataEntradaUda() {
		return dataEntradaUda;
	}

	public PePreferido getPePreferido() {
		return pePreferido;
	}

	public Double getPeso() {
		return peso;
	}

	public Double getAltura() {
		return altura;
	}

	public String getLocalidadeNascimento() {
		return localidadeNascimento;
	}

	public String getPaisNascimento() {
		return paisNascimento;
	}
	
	public Set<ContatoAtletaVO> getContatos() {
		return contatos;
	}

	public void setAtletaId(int atletaId) {
		this.atletaId = atletaId;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setDataEntradaUda(Date dataEntradaUda) {
		this.dataEntradaUda = dataEntradaUda;
	}

	public void setPePreferido(PePreferido pePreferido) {
		this.pePreferido = pePreferido;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public void setLocalidadeNascimento(String localidadeNascimento) {
		this.localidadeNascimento = localidadeNascimento;
	}

	public void setPaisNascimento(String paisNascimento) {
		this.paisNascimento = paisNascimento;
	}
	
	public void setContatos(Set<ContatoAtletaVO> contatos) {
		this.contatos = contatos;
	}
	
}
