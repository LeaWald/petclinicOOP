package petclinic;

// Cat class extends Pet and defines cat-specific behavior
public class Cat extends Pet {
	private String color; // Cat's color

	public Cat(String name, int age, String color) {
		super(name, age, "Cat");
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String makeSound() {
		return "Meow";
	}

	@Override
	public String eat() {
		return "Cat food";
	}
}
