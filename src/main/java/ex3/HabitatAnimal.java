/**
 * 
 */
package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Décrit un habitat
 * 
 * @author gmayeul
 *
 */
public class HabitatAnimal {
	private TypeHabitat type;
	private List<Animal> listeAnimaux;

	/**
	 * Constructeur
	 * 
	 * @param type
	 */
	public HabitatAnimal(TypeHabitat type) {
		super();
		this.type = type;
		this.listeAnimaux = new ArrayList<Animal>();
	}

	/**
	 * Ajoute un animal à un habitat
	 * 
	 * @param animal
	 */
	public void ajouterAnimal(Animal animal) {
		listeAnimaux.add(animal);
	}

	/**
	 * Affiche la liste des animaux de l'habitat
	 */
	public void afficherListeAnimaux() {
		for (Animal animal : listeAnimaux) {
			System.out.println(animal.getNom());
		}
	}

	/**
	 * Compte les animaux d'un habitat
	 * 
	 * @return
	 */
	public int compterAnimaux() {
		return listeAnimaux.size();
	}

	/**
	 * Calcule la quantité de nourriture quotidienne nécessaire à un habitat
	 * 
	 * @return
	 */
	public double calculerKgsNourritureParJour() {
		double kgsNourritureParAnimal;
		switch (type) {
		case SAVANE:
			kgsNourritureParAnimal = 10;
			break;
		case CARNIVORE:
			kgsNourritureParAnimal = 10;
			break;
		case REPTILE:
			kgsNourritureParAnimal = 0.1;
			break;
		case AQUARIUM:
			kgsNourritureParAnimal = 0.2;
			break;
		default:
			kgsNourritureParAnimal = 0;
			break;
		}
		return listeAnimaux.size() * kgsNourritureParAnimal;
	}

	/**
	 * @return the type
	 */
	public TypeHabitat getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(TypeHabitat type) {
		this.type = type;
	}

}
