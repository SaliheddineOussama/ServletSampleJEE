package metier;

public class TestMetier {

	public static void main(String[] args) {
		CreditMetierImpl metier = new CreditMetierImpl();
		double montant = 200000;
		double taux = 4.5;
		int duree= 240;
		
		double m = metier.calculMensualiteCredit(montant, taux, duree);
		
		System.out.println(m);
	}

}
