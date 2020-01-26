package pt.rafavr.udaplaymaker.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import pt.rafavr.udaplaymaker.constants.AppConstants;

@Entity
@Table(name = "Utilizadores")
@EntityListeners(AuditingEntityListener.class)
public class UtilizadorVO extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userId;
	
	@Email
	@Size(min = 10, max = 100)
	@Column(name = "email", nullable = false, length = 100, unique = true)
	private String email;
	
	@NotNull
	@Pattern(regexp = AppConstants.LOGIN_REGEX)
	@Size(min = 6, max = 100)
	@Column(name = "login", nullable = false, length = 100, unique = true)
	private String login;
	
	@NotNull
	@Size(min = 60, max = 60)
	@Column(name = "password_hash", length = 60, nullable = false)
	private String password;
	
	@NotNull
	@Size(max = 50)
	@Column(name = "first_name", nullable = false, length = 50)
	private String firstName;
	
	@NotNull
	@Size(max = 100)
	@Column(name = "last_name", nullable = false, length = 100)
	private String lastName;
	
	
	public UtilizadorVO() {}

	public int getUserId() {
		return userId;
	}

	public String getEmail() {
		return email;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
