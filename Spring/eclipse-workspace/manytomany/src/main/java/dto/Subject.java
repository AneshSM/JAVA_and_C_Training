package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sbjid;
	@NeverNull
	private String sbjname;
	@ManyToMany
	private List<Student> slist;
	public int getSbjid() {
		return sbjid;
	}
	public void setSbjid(int sbjid) {
		this.sbjid = sbjid;
	}
	public String getSbjname() {
		return sbjname;
	}
	public void setSbjname(String sbjname) {
		this.sbjname = sbjname;
	}
	public List<Student> getSlist() {
		return slist;
	}
	public void setSlist(List<Student> slist) {
		this.slist = slist;
	}
}
