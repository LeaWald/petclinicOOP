package petclinic;

//Specialist veterinarian who extends GeneralVeterinarian
public class SpecialistVeterinarian extends GeneralVeterinarian {
	private String specialty;

	public SpecialistVeterinarian(String name, String specialty) {
		super(name);
		this.specialty = specialty;
	}

	@Override
	public String examinePet(Pet pet) {
		return "Specialist (" + specialty + ") checkup: " + pet.getName() + " the " + pet.getSpecies()
				+ " needs extra care.";
	}
}
