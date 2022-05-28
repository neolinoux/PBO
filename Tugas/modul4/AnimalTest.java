public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobby");
        Cat cat = new Cat("Kitty");
        BigDog bigDog = new BigDog("Bobby");

        dog.greets();
        cat.greets();
        bigDog.greets();

        dog.greets(bigDog);
        bigDog.greets(dog);
    }   
}
