package ex3;

/**
 * Enumère les comportements alimentaires des animaux
 * 
 * @author gmayeul
 *
 */
public enum ComportementAnimal {
	CARNIVORE("Carnivore"), HERBIVORE("Herbivore");

	private String nom;

	/**
	 * @param nom
	 */
	private ComportementAnimal(String nom) {
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
