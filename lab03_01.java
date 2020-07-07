
public class lab03_01 {
	public static void main(String[] args) {
		Person personObj = new Person("John Corwin", "oceanside", "7603145514");
		Customer customerObj = new Customer("Joshua Vejehas", "Carlsbad", "7604568839", "5435543");
		System.out.printf("%s\n", personObj.toString());
		System.out.printf("%s", customerObj.toString());
	}
}
