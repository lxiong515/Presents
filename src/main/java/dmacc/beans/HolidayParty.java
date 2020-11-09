package dmacc.beans;
import lombok.Data;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class HolidayParty {
	private String eventName;
	private String street;
	private String city;
	private String state;
	
	public HolidayParty() {
		
	}
	public HolidayParty(String eventName, String street, String city, String state) {

	}
	
}
