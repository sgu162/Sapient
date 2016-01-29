
public class BankLoan {
	
	private int LoanId;
	private int CustomerId;
	private String LoanType;
	private double RateOfInterest;
	
	public int getLoanId() {
		return LoanId;
	}
	public void setLoanId(int loanId) {
		LoanId = loanId;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getLoanType() {
		return LoanType;
	}
	public void setLoanType(String loanType) {
		LoanType = loanType;
	}
	public BankLoan(int loanId, int customerId, String loanType) {
		super();
		LoanId = loanId;
		CustomerId = customerId;
		LoanType = loanType;
	}
	
	

}
