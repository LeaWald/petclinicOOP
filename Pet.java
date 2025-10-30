package petclinic;

// Abstract class representing a general pet
public abstract class Pet {
	private String name; // Pet's name
	private int age; // Pet's age
	protected String species; // Species is protected so subclasses can access it

	public Pet(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSpecies() {
		return species;
	}

	// Abstract methods - subclasses must implement them
	public abstract String makeSound();

	public abstract String eat();
}
