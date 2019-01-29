package Test;

import static org.junit.Assert.*;
import metier.CreditMetierImpl;
import metier.ICreditMetier;

import org.junit.Before;
import org.junit.Test;

public class testCalculMesualite {

	private ICreditMetier metier;
	@Before
	public void setUp() throws Exception {
		metier = new CreditMetierImpl();
	}

	@Test
	public void testCalculMensualiteCredit() {
		double montant = 200000;
		double taux = 4.5;
		int duree= 240;
		
		double resultatAttendu = 1265.2987;
		double m = metier.calculMensualiteCredit(montant, taux, duree);
	
		assertEquals(resultatAttendu, m, 0.001);
	}

}
