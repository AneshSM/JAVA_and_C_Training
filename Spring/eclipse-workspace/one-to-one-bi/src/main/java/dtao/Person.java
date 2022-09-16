package dtao;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private String pemail;
	
	@OneToOne(mappedBy = "P")
	Pan p=new Pan();

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public Pan getP() {
		return p;
	}

	public void setP(Pan p) {
		this.p = p;
	}
	
}
