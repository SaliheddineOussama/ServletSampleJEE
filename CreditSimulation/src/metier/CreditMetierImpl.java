package metier;

public class CreditMetierImpl implements ICreditMetier {

	@Override
	public double calculMensualiteCredit(double montant, double taux, int duree) {
		double t=taux/100;
		double t1 = montant*t/12;
		double t2= 1 - Math.pow((1+t/12), -1*duree);
		return t1/t2;
	}

}
