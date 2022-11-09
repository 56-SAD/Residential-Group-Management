package HouseholdBook;

import java.util.List;

import Demography.Householder;
import Demography.Person;

public class HouseholdBook {
	
	private String id;
	private int numberOfBook;
	private Householder householder;
	private Address address;
	private List<Person> persons;
	
	// Getter and Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNumberOfBook() {
		return numberOfBook;
	}
	public void setNumberOfBook(int numberOfBook) {
		this.numberOfBook = numberOfBook;
	}
	public Householder getHouseholder() {
		return householder;
	}
	public void setHouseholder(Householder householder) {
		this.householder = householder;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Person> getPersons() {
		return persons;
	}
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
}
