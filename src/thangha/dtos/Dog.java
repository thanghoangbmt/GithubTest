package thangha.dtos;

public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void speak() {
		System.out.println("Gau gau");
	}

}
