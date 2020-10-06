package creatures;

public class Felidae extends Animal {
    public Felidae(int age, int weight) {
        super(age, weight);
    }

    public void makeSound() {
        System.out.println("meowing meowing sound");
    }
}
