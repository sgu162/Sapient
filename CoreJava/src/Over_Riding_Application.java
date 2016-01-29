
public class Over_Riding_Application {

	public final static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeInsurance ins1 = new LifeInsurance(101,"sammy","ann",9800);
		LifeInsurance ins2 = new LifeInsurance(101,"sammy","ann",9800);
		LifeInsurance ins3 = null;
		String s = "ggds";
		System.out.println(ins1.equals(ins2));
		System.out.println(ins1.equals(ins3));
		System.out.println(ins1.equals(s));
		

	}

}
