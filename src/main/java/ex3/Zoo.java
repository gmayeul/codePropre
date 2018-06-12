package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	/** nom (String) */
	private String nom;

	/** listeHabitats (List<HabitatAnimal>) */
	private List<HabitatAnimal> listeHabitats;

	/**
	 * Constructeur
	 * 
	 * @param nom
	 */
	public Zoo(String nom) {
		this.nom = nom;
		this.listeHabitats = new ArrayList<HabitatAnimal>();
	}

	/**
	 * Affiche la liste des animaux du zoo, habitat par habitat
	 */
	public void afficherListeAnimaux() {
		for (HabitatAnimal habitat : listeHabitats) {
			System.out.println(habitat.getType().getNom() + " :");
			habitat.afficherListeAnimaux();
			System.out.println();
		}
	}

	/**
	 * Ajoute un animal dans le zoo, dans un habitat adapté (on considère que
	 * chaque habitat à un type unique)
	 * 
	 * @param animal
	 */
	public void ajouterAnimal(Animal animal) {
		for (HabitatAnimal habitat : listeHabitats) {
			if (habitat.getType().equals(animal.getHabitat()))
				habitat.ajouterAnimal(animal);
		}
	}

	/**
	 * Ajoute un habitat au zoo
	 * 
	 * @param habitat
	 */
	public void ajouterHabitat(HabitatAnimal habitat) {
		listeHabitats.add(habitat);
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the listeHabitats
	 */
	public List<HabitatAnimal> getListeHabitats() {
		return listeHabitats;
	}

	/**
	 * @param listeHabitats
	 *            the listeHabitats to set
	 */
	public void setListeHabitats(List<HabitatAnimal> listeHabitats) {
		this.listeHabitats = listeHabitats;
	}
}
