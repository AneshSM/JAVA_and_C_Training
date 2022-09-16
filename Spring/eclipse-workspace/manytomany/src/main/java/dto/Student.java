package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NeverNull
	private int sid;
	@NeverNull
	private String sname;
	@ManyToMany
	private List<Subject> sbjlist;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Subject> getSbjlist() {
		return sbjlist;
	}
	public void setSbjlist(List<Subject> sbjlist) {
		this.sbjlist = sbjlist;
	}
	
}
