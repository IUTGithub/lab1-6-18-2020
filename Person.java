
public class Person {
	private String pName;
	private String pCity;
	private String pPhone;
	protected int Pin;
	
	public Person(String name, String city, String Phone) {
		pName = name;
		pCity = city;
		pPhone = Phone;
		Pin = (int)(Math.random()*100);
	}
	
	   public String getName() {
		return pName;
	}
	
	public String getCity() {
		return pCity;
	}
	
	public String getPhone() {
		return pPhone;
	}
	
	public void setName(String newName) {
		pName = newName;
	}
	
	public void setCity(String newCity) {
		pCity = newCity;
	}
	
	public void setPhone(String newPhone) {
		pPhone = newPhone;
	}
	
	public String toString() {
		return (getName() + " lives in " + getCity() + ", with phone #" + getPhone());
	}
}
