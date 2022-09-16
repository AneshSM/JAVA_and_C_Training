package oneTOone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity
public class Adhar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NeverNull
	private int id;
	@NeverNull
	private long aNum;
	@NeverNull
	private String Address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getaNum() {
		return aNum;
	}
	public void setaNum(long aNum) {
		this.aNum = aNum;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
