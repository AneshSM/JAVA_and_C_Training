package dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity
public class Feature {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NeverNull
	private int fid;
	
	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	private LocalDateTime dateTime;
	
	private String featureName;
	
	@ManyToMany
	@JoinTable(name = "car_feature",joinColumns = @JoinColumn(name = "fid"),inverseJoinColumns = @JoinColumn(name = "cid"))	
	List<Car> carList; 

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

}
