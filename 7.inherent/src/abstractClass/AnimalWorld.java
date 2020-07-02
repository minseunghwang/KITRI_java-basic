package abstractClass;

public class AnimalWorld {
	public static void main(String[] args) {
		Animal animal;
		// #1
		Dog dog = new Dog();
		dog.sound();
		dog = null;
		Cat cat = new Cat();
		cat.sound();
		cat = null;
		
		// #2
		animal = dog;
		animal.sound();
		animal = cat;
		animal.sound();
		
		// #3
		cat = (Cat)animal;
		cat.sound();
		
		
		if(animal instanceof Dog) {
			dog = (Dog)animal;
			dog.sound();
		}
		System.out.println("----------------------");
		// #4
		dog = new Dog();
		cat = new Cat();
		animalSound(dog);
		animalSound(cat);
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
