
public class LifeInsurance {
	
private long policyNumber;
private String policyHolderName;
private String paymentMode;
private double policyAmount;

static{
	System.out.println("Static Block Called");
}
{
	System.out.println("Initiatition Block Called");
	}
public LifeInsurance()
{
	super();
	System.out.println("Constructor Block Called");
}



public LifeInsurance(long policyNumber, String policyHolderName, String paymentMode, double policyAmount) 
{
	super();
	this.policyNumber = policyNumber;
	this.policyHolderName = policyHolderName;
	this.paymentMode = paymentMode;
	this.policyAmount = policyAmount;
}



public long getPolicyNumber() {
	return policyNumber;
}
public void setPolicyNumber(long policyNumber) {
	this.policyNumber = policyNumber;
}
public String getPolicyHolderName() {
	return policyHolderName;
}
public void setPolicyHolderName(String policyHolderName) {
	this.policyHolderName = policyHolderName;
}
public String getPaymentMode() {
	return paymentMode;
}
public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}
public double getPolicyAmount() {
	return policyAmount;
}
public void setPolicyAmount(double policyAmount) {
	this.policyAmount = policyAmount;
}

public double calculate()
{
return this.policyAmount*.10;	
}


/* just changing the return type or the modifier it is improper overloading
//public double calculate(){}
//public int calculate(){}
private double calculate(){}
*/


//overloaded method must have different arguments
public double calculate(double policyAmt)
{
	double amount= policyAmt * .10;
	double discount= amount * .05;
	double netAmount = amount - discount;
	return netAmount;
	
	}



@Override
public int hashCode() {
	// TODO Auto-generated method stub
	long code = this.policyNumber + 7*policyNumber;
	 return (int)code;
}



@Override
public boolean equals(Object obj) 
{
	// Checking for Identity
	if(this==obj) 
		return true;
	
	//Cautions
	if(obj==null)
		return false;
	
	if(this.getClass()!=obj.getClass())
		return false;
	
	//Checking the Condition
	
	LifeInsurance ins=(LifeInsurance)obj;
	return policyNumber==ins.policyNumber && policyHolderName.equals(ins.policyHolderName);
	
}



@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.policyAmount + ":" + this.policyHolderName + ":" ;
}
}
