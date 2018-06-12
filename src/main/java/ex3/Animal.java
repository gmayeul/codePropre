/**
 * 
 */
package ex3;

/**
 * @author gmayeul
 *
 */
public class Animal {
	/** nom (String) */
	private String nom;

	/** type (TypeAnimal) */
	private TypeAnimal type;

	/** comportement (ComportementAnimal) */
	private ComportementAnimal comportement;

	/** habitat (Habitat) */
	private TypeHabitat habitat;

	/**
	 * @param nom
	 * @param type
	 * @param comportement
	 * @param habitat
	 */
	public Animal(String nom, TypeAnimal type, ComportementAnimal comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
		this.setHabitat(determinerHabitat(type, comportement));
	}

	/**
	 * Calcule l'ahabitat adapté à un animal en fonction de son type et de son
	 * comportement alimentaire
	 * 
	 * @param typeAnimal
	 * @param comportementAnimal
	 * @return
	 */
	private TypeHabitat determinerHabitat(TypeAnimal typeAnimal, ComportementAnimal comportementAnimal) {
		TypeHabitat hab = null;
		switch (type) {
		case MAMMIFERE:
			switch (comportement) {
			case CARNIVORE:
				hab = TypeHabitat.CARNIVORE;
				break;
			case HERBIVORE:
				hab = TypeHabitat.SAVANE;
				break;
			default:
				break;
			}
			break;
		case POISSON:
			hab = TypeHabitat.AQUARIUM;
			break;
		case SERPENT:
			hab = TypeHabitat.REPTILE;
			break;
		default:
			break;
		}
		return hab;
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

	/**
	 * @return the type
	 */
	public TypeAnimal getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(TypeAnimal type) {
		this.type = type;
	}

	/**
	 * @return the comportement
	 */
	public ComportementAnimal getComportement() {
		return comportement;
	}

	/**
	 * @param comportement
	 *            the comportement to set
	 */
	public void setComportement(ComportementAnimal comportement) {
		this.comportement = comportement;
	}

	/**
	 * @return the habitat
	 */
	public TypeHabitat getHabitat() {
		return habitat;
	}

	/**
	 * @param habitat
	 *            the habitat to set
	 */
	public void setHabitat(TypeHabitat habitat) {
		this.habitat = habitat;
	}
}
