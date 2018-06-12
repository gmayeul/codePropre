package ex2;

/**
 * Repr�sente un livret A, sp�cialisation d'un compte bancaire
 * 
 * @author gmayeul
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration (double) */
	private double tauxRemuneration;

	/**
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Applique la r�mun�ration annuelle � un livret A
	 */
	public void appliquerRemunerationAnnuelle() {
		double soldeCourant = getSolde();
		setSolde(soldeCourant + soldeCourant * tauxRemuneration / 100);
	}

	/**
	 * D�bite un livret A d'un montant donn�
	 * 
	 * @param montant
	 */
	public void debiter(double montant) {
		double soldeCourant = getSolde();
		if (soldeCourant - montant > 0) {
			setSolde(soldeCourant - montant);
		}
	}

	/**
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
