
public class Input extends Node{
	
	String date;
	String hour;
	String user;
	String device;
	String activity;
	
	public Input(String id, String date, String hour, String user, String device, String activity) {
		super(id);
		this.date = date;
		this.hour = hour;
		this.user = user;
		this.device = device;
		this.activity = activity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	
	
}
