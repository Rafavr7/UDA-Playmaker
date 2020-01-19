package pt.rafavr.udaplaymaker.database.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "test_table")
@EntityListeners(AuditingEntityListener.class)
public class TempTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tempId;
	
	private String tempDescricao;
	
	private String tempUtilizador;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date createdAt;

	public Long getTempId() {
		return tempId;
	}

	public void setTempId(Long tempId) {
		this.tempId = tempId;
	}

	public String getTempDescricao() {
		return tempDescricao;
	}

	public void setTempDescricao(String tempDescricao) {
		this.tempDescricao = tempDescricao;
	}

	public String getTempUtilizador() {
		return tempUtilizador;
	}

	public void setTempUtilizador(String tempUtilizador) {
		this.tempUtilizador = tempUtilizador;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
