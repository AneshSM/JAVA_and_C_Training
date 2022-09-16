package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity
public class User {
	@Id @NeverNull
	private int id;
	@NeverNull
	private String name;
	@NeverNull
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
}
