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
	//getters and setters
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Holiday Party [Event Name=" + eventName + " , street=" + street + " , city=" + city + " , state=" + state + "]";
	}

}
