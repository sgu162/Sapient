import java.util.Scanner;

public class InsuranceApplication {

	public static void main(String[] args) {
		
		LifeInsurance ins1 = new LifeInsurance();
		//Instance variable has a default value
		System.out.println(ins1.calculate());
		
		//using parameterized constructor
		LifeInsurance ins2= new LifeInsurance(911,"Shubham","annual",60000);

		System.out.println(ins2.calculate());
		
		//using wrapper class
		
		long policyNumber=Long.parseLong(args[0]);
		double policyAmount=Double.parseDouble(args[3]);
		
		//command line arguments
		
		LifeInsurance ins3= new LifeInsurance(policyNumber,args[1],args[2],policyAmount);

		System.out.println(ins3.calculate());
		
		//Using Scanner Class
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter policy Number");
		long policyNumber1=sc.nextLong();
		System.out.println("Enter policy Holder Name");
		String policyHolderName=sc.next();
		System.out.println("Enter payment Mode");
		String paymentMode1=sc.next();
		System.out.println("Enter Premium Amount");
		double policyAmount1=sc.nextDouble();
		
		LifeInsurance ins4 = new LifeInsurance(policyNumber1,policyHolderName,paymentMode1,policyAmount1);
		System.out.println(ins4.calculate());
		
		sc.close();
		
		// Overloading
		LifeInsurance ins5 = new LifeInsurance();
		System.out.println(ins5.calculate(100000));
	}

}
