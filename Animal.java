class Animal {
    void makeSound() {
        System.out.println("Hi from Animal!!");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Animal dog = new Dog();
        dog.makeSound();

        Dog dog2 = new Dog();
        dog2.makeSound();
    }
}

class Dog extends Animal{
    @Override 
    void makeSound() {
        super.makeSound();
        System.out.println("Hi from the Dog!!");
    }
}