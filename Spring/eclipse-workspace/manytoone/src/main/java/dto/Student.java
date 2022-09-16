package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String snmae;
	@ManyToOne
	private Branch b;
	
	public Branch getB() {
		return b;
	}
	public void setB(Branch b) {
		this.b = b;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSnmae() {
		return snmae;
	}
	public void setSnmae(String snmae) {
		this.snmae = snmae;
	}
	
}
