package oop1;

public class IndividualCustomer extends Customer { // extends=genişletmek, diğer classdan verileri/değerleri buraya da
													// almış oluruz
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
