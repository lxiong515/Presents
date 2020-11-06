package dmacc.beans;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Data
@Entity
@Table(name="my_presents")
public class Presents {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="present")
	private String present;
	@Column(name="relationship")
	private String relationship;
	@Autowired
	private HolidayParty holidayParty;
	
	public Presents() {
		super();
		//this.relationship="spouse";
	}
	public Presents(String name) {
		
	}
	public Presents(String name, String present, String relationship) {
		
	}
	//create getters and setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPresent() {
		return present;
	}
	public void setPresent(String present) {
		this.present = present;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	
	@Override
	public String toString() {
		return "Recipient [id = " + id +", name=" + name + ", present=" + present + ", relationship=" + relationship + "]";
	}

	public void setHolidayParty(HolidayParty h) {
		// TODO Auto-generated method stub
		this.holidayParty = holidayParty;
	}

}
