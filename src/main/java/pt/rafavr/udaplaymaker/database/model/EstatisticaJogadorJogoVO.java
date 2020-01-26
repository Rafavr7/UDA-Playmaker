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

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * 
 * @author Rafael Vieira Rangel
 * 
 * Esta classe representa as estatísticas de um único jogador em um único jogo.
 * Aqui estão localizadas informações do gênero: quantidade de remates, golos, assistências, etc...
 *
 */

@Entity
@Table(name = "Estatísticas_Jogador_Jogo")
@EntityListeners(AuditingEntityListener.class)
public class EstatisticaJogadorJogoVO extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "estatistica_id")
	private int estatisticaId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "jogo_id", nullable = false)
	private JogoVO jogo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "atleta_id", nullable = false)
	private AtletaVO atleta;
	
	@NotNull
	@Column(name = "golos", columnDefinition = "NUMERIC(2,0) DEFAULT 0")
	private int golos;
	
	@NotNull
	@Column(name = "assistencias", columnDefinition = "NUMERIC(2,0) DEFAULT 0")
	private int assistencias;
	
	@NotNull
	@Column(name = "remates_perigosos", columnDefinition = "NUMERIC(2,0) DEFAULT 0")
	private int rematesPerigosos;
	
	@NotNull
	@Column(name = "cartoes_amarelos", columnDefinition = "NUMERIC(1,0) DEFAULT 0")
	private int cartoesAmarelos;
	
	@NotNull
	@Column(name = "cartao_vermelho", columnDefinition = "BOOLEAN DEFAULT FALSE")
	private boolean cartaoVermelho;
	
	@NotNull
	@Column(name = "faltas_cometidas", columnDefinition = "NUMERIC(2,0) DEFAULT 0")
	private int faltasCometidas;
	
	@NotNull
	@Column(name = "faltas_sofridas", columnDefinition = "NUMERIC(2,0) DEFAULT 0")
	private int faltasSofridas;
	
	@NotNull
	@Column(name = "defesas_importantes_gr", columnDefinition = "NUMERIC(2,0) DEFAULT 0")
	private int defesasImportantesGR;
	
	@NotNull
	@Column(name = "desarmesImportantes", columnDefinition = "NUMERIC(2,0) DEFAULT 0")
	private int desarmesImportantes;
	
	
	public EstatisticaJogadorJogoVO() {}


	public int getEstatisticaId() {
		return estatisticaId;
	}


	public JogoVO getJogo() {
		return jogo;
	}


	public AtletaVO getAtleta() {
		return atleta;
	}


	public int getGolos() {
		return golos;
	}


	public int getAssistencias() {
		return assistencias;
	}


	public int getRematesPerigosos() {
		return rematesPerigosos;
	}


	public int getCartoesAmarelos() {
		return cartoesAmarelos;
	}


	public boolean isCartaoVermelho() {
		return cartaoVermelho;
	}


	public int getFaltasCometidas() {
		return faltasCometidas;
	}


	public int getFaltasSofridas() {
		return faltasSofridas;
	}


	public int getDefesasImportantesGR() {
		return defesasImportantesGR;
	}


	public int getDesarmesImportantes() {
		return desarmesImportantes;
	}


	public void setEstatisticaId(int estatisticaId) {
		this.estatisticaId = estatisticaId;
	}


	public void setJogo(JogoVO jogo) {
		this.jogo = jogo;
	}


	public void setAtleta(AtletaVO atleta) {
		this.atleta = atleta;
	}


	public void setGolos(int golos) {
		this.golos = golos;
	}


	public void setAssistencias(int assistencias) {
		this.assistencias = assistencias;
	}


	public void setRematesPerigosos(int rematesPerigosos) {
		this.rematesPerigosos = rematesPerigosos;
	}


	public void setCartoesAmarelos(int cartoesAmarelos) {
		this.cartoesAmarelos = cartoesAmarelos;
	}


	public void setCartaoVermelho(boolean cartaoVermelho) {
		this.cartaoVermelho = cartaoVermelho;
	}


	public void setFaltasCometidas(int faltasCometidas) {
		this.faltasCometidas = faltasCometidas;
	}


	public void setFaltasSofridas(int faltasSofridas) {
		this.faltasSofridas = faltasSofridas;
	}


	public void setDefesasImportantesGR(int defesasImportantesGR) {
		this.defesasImportantesGR = defesasImportantesGR;
	}


	public void setDesarmesImportantes(int desarmesImportantes) {
		this.desarmesImportantes = desarmesImportantes;
	}
}
