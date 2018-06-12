/**
 * 
 */
package ex3;

/**
 * Enumère les habitats pour les animaux
 * 
 * @author gmayeul
 *
 */
public enum TypeHabitat {
	SAVANE("Savane africaine"), CARNIVORE("Zone carnivore"), REPTILE("Ferme de reptiles"), AQUARIUM("Aquarium");

	private String nom;

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

	/**
	 * @param nom
	 */
	private TypeHabitat(String nom) {
		this.nom = nom;
	}
}
