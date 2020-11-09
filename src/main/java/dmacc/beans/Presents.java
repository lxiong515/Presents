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
	
	

}
