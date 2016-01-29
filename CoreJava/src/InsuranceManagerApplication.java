
public class InsuranceManagerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeInsurance ins1 = new LifeInsurance(101,"samn","QTR",45000);
		LifeInsurance ins2 = new LifeInsurance(102,"salu","ANN",55000);
		LifeInsurance ins3 = new LifeInsurance(103,"vaib","HLF",65000);
		LifeInsurance ins4 = new LifeInsurance(104,"ramit","QTR",75000);
		
		LifeInsurance[] list = new LifeInsurance[4];
		
		list[0]=ins1;
		list[2]=ins2;
		list[2]=ins3;
		list[3]=ins4;
		
		InsuranceManager inm = new InsuranceManager();
		inm.printPremium(list);

	}

}
