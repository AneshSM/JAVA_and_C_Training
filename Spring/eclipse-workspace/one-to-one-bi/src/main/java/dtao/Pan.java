package dtao;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Pan {
	
	private int panid;
	private String panNum;
	private String panaddress;
	
	@JoinColumn(name = "pid")
	@OneToOne
	Person p=new Person();

	public int getPanid() {
		return panid;
	}

	public void setPanid(int panid) {
		this.panid = panid;
	}

	public String getPanNum() {
		return panNum;
	}

	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}

	public String getPanaddress() {
		return panaddress;
	}

	public void setPanaddress(String panaddress) {
		this.panaddress = panaddress;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}
	
}
