package thangha.dtos;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.println("Meo meo");
	}

}
