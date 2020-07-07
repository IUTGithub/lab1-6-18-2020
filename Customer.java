
public class Customer extends Person {
	private String customerNum;
	public Customer(String name, String city, String phone, String number) {
		super(name, city, phone);
		customerNum = number;
	}
	
	public void setNumber(String Newnumber) {
		customerNum = Newnumber;
	}
	
	public String getNumber() {
		return customerNum;
	}
	
	public String toString() {
		return (super.toString() + "[" + super.Pin + "]" + ", with customer number " + customerNum);
	}
}
