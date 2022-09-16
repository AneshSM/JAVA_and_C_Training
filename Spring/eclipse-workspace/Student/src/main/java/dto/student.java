package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity
public class student {
	@Id @NeverNull
	private int id;
	@NeverNull
	private String name;
	@NeverNull
	private String email;
	@NeverNull
	private long phone;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}	
}
