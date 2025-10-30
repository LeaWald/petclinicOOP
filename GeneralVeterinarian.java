package petclinic;

//General veterinarian implementation
public class GeneralVeterinarian implements Veterinarian {
	private String name;

	public GeneralVeterinarian(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String examinePet(Pet pet) {
		return "General checkup: " + pet.getName() + " the " + pet.getSpecies() + " looks healthy.";
	}
}
