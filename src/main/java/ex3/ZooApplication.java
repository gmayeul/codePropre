package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.ajouterHabitat(new HabitatAnimal(TypeHabitat.AQUARIUM));
		zoo.ajouterHabitat(new HabitatAnimal(TypeHabitat.REPTILE));
		zoo.ajouterHabitat(new HabitatAnimal(TypeHabitat.SAVANE));
		zoo.ajouterHabitat(new HabitatAnimal(TypeHabitat.CARNIVORE));
		
		zoo.ajouterAnimal(new Animal("Gazelle", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE));
		zoo.ajouterAnimal(new Animal("Zèbre", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE));
		zoo.ajouterAnimal(new Animal("Lion", TypeAnimal.MAMMIFERE, ComportementAnimal.CARNIVORE));
		zoo.ajouterAnimal(new Animal("Panthère", TypeAnimal.MAMMIFERE, ComportementAnimal.CARNIVORE));
		zoo.ajouterAnimal(new Animal("Requin blanc", TypeAnimal.POISSON, ComportementAnimal.CARNIVORE));
		zoo.ajouterAnimal(new Animal("Truite dorée", TypeAnimal.POISSON, ComportementAnimal.HERBIVORE));
		zoo.ajouterAnimal(new Animal("Boa constrictor", TypeAnimal.SERPENT, ComportementAnimal.CARNIVORE));
		zoo.ajouterAnimal(new Animal("Python", TypeAnimal.SERPENT, ComportementAnimal.CARNIVORE));
		
		zoo.afficherListeAnimaux();
	}

}
