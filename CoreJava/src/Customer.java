
public class Customer {
	
	private int CustomerId;
	private int CustomerName;
	
	
	public Customer(int customerId, int customerName) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
	}
	
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public int getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(int customerName) {
		CustomerName = customerName;
	}
	
	

}
