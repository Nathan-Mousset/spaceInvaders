package fr.unilim.iut.spaceInvaders;

import org.junit.Before;
import org.junit.Test;

import utils.MissileException;

public class VaisseauTest {
		private Vaisseau vaisseau;
		
		@Before
	    public void initialisation() {
		    vaisseau = new Vaisseau(new Dimension(7,2),new Position(5,9), 2);
	    }
		
		 @Test(expected = MissileException.class)
			public void test_LongueurMissileSuperieureALongueurVaisseau_UneExceptionEstLevee() throws Exception {
				Vaisseau vaisseau = new Vaisseau(new Dimension(5,2),new Position(5,9), 1);
				vaisseau.tirerUnMissile(new Dimension(7,2),1);
			}
		 

		
		
	

}
