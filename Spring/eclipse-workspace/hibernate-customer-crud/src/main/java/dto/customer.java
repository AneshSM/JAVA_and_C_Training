package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity
@Table(name = "customer")
public class customer {
	@Id
	@Column(name = "cid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NeverNull
	private int id;
	@Column(name = "cname")
	@NeverNull
	private String name;
	@Column(name = "cemail")
	@NeverNull
	private String email;
	@Column(name = "cphnum")
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
