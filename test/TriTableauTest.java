import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jenkins.TriTableau;

/**
 * @author YoYoYo Zetsubō Zetsubō
 *
 */

public class TriTableauTest {
	
	private int[] t1 = {1,7,94,23,36,666,84,28,113};
	private int[] t2 = {1,7,23,28,36,84,94,113,666};
	private int[] t3 = {666,113,94,84,36,28,23,7,1};

	/**
	 * Test method for {@link TriTableau#triCroissant(int[])}.
	 */
	@Test
	void testTriCroissant() 
	{
        TriTableau monTri = new TriTableau();
        monTri.triCroissant(t1);
        assertArrayEquals(t1, t2);
	}
	
	/**
	 * Test method for {@link TriTableau#triDecroissant(int[])}.
	 */
	@Test
	void testTriDecroissant() 
	{
		try {
	        TriTableau monTri = new TriTableau();
	        monTri.triDecroissant(t1);
	        assertArrayEquals(t1, t3);
		} catch (ArrayIndexOutOfBoundsException e) {
			fail("###-->\n"
					+ "[ERROR] Une ERREUR sauvage apparaît !\n"
					+ "[ERROR] Nous sommes de retour\n"
					+ "[ERROR] Pour vous jouer un mauvais tour\n"
					+ "[ERROR] Afin de préserver le monde de la dévastation\n"
					+ "[ERROR] Afin de rallier tous les peuples à notre nation\n"
					+ "[ERROR] Afin d'écraser l'amour et la vérité\n"
					+ "[ERROR] Afin d'étendre notre pouvoir jusqu'à la voie lactée\n"
					+ "[ERROR] Jessie !\n"
					+ "[ERROR] James !\n"
					+ "[ERROR] La Team Rocket plus rapide que la lumière\n"
					+ "[ERROR] Rendez-vous tous, ou ce sera la guerre\n"
					+ "[ERROR] Miaouss, oui, la guerre !\n" + e);
		}
	}
}
