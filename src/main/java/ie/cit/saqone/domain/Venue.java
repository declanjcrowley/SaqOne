package ie.cit.saqone.domain;

public class Venue {
	String name;
	String addressLine1;
	String addressLine2;
	String country;
	int capacity;
	
	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Venue() {
		System.out.println("Venue() blank ");
	}
	
	@Override
	public String toString() {
		return "Venue [name=" + name + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", country=" + country + ", capacity=" + capacity + "]";
	}

	public Venue(String name, String addressLine1, String addressLine2, String country, int capacity) {
		super();
		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.country = country;
		this.capacity = capacity;
	}

	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
}
