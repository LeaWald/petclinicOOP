package petclinic;

//Dog class extends Pet and represents a specific type of pet
public class Dog extends Pet {
	private String breed; // Dog's breed

	public Dog(String name, int age, String breed) {
		super(name, age, "Dog");
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	// Dog makes a barking sound
	@Override
	public String makeSound() {
		return "Woof! Woof!";
	}

	// What dogs eat
	@Override
	public String eat() {
		return "Dog food";
	}
}
