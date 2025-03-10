package Animal;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal animal = factory.getAnimal("feline");
        System.out.println(animal.makeSound());
        Animal animal2 = factory.getAnimal("canine");
        System.out.println(animal2.makeSound());
    }
}
