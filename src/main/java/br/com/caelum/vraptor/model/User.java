package br.com.caelum.vraptor.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User extends Model{
	

	
	@NotEmpty @Size(min = 4, max = 20)
	private String name;
	
	@NotEmpty @Email
	private String email;
	
	@NotEmpty @Size(min = 4, max = 20)
	private String password;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setLastName(String lastName) {
		this.name += " " + lastName;
	}
}
