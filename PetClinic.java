package petclinic;

public class PetClinic {

	public static void main(String[] args) {
		// Create pets
		Pet[] pets = new Pet[2];
		pets[0] = (new Dog("Rex", 3, "Labrador"));
		pets[1] = (new Cat("Misty", 2, "Gray"));

		// Create veterinarians
		Veterinarian generalVet = new GeneralVeterinarian("Dr. Cohen");
		Veterinarian specialistVet = new SpecialistVeterinarian("Dr. Levi", "Dermatology");

		// Display examination results
		for (Pet pet : pets) {
			System.out.println("------");
			System.out.println(pet.getName() + " the " + pet.getSpecies());
			System.out.println("Sound: " + pet.makeSound());
			System.out.println("Eats: " + pet.eat());
			System.out.println(generalVet.examinePet(pet));
			System.out.println(specialistVet.examinePet(pet));
			
		}
	}
}
