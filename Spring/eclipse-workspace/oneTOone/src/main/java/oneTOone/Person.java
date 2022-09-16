package oneTOone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import net.bytebuddy.utility.nullability.NeverNull;


@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NeverNull
	private int pid;
	@NeverNull
	private String name;
	@NeverNull
	private String email;
	@OneToOne
	private Adhar a;
	
	public Adhar getA() {
		return a;
	}

	public void setA(Adhar a) {
		this.a = a;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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
