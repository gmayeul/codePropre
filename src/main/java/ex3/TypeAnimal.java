package ex3;

/**
 * Enumère les types d'animaux
 * 
 * @author gmayeul
 *
 */
public enum TypeAnimal {
	MAMMIFERE("Mammifère"), SERPENT("Serpent"), POISSON("Poisson");

	private String nom;

	/**
	 * @param nom
	 */
	private TypeAnimal(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
