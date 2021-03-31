package SpringAssignment;

public class Customer  {
	private int customerId;
	private String customerName;
	private int customerContact;
	private Address customerAddress;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void display()
	{
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(customerContact);
		System.out.println(customerAddress);
	}

}
