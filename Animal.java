import java.util.UUID;

public abstract class Animal {
    protected String id;
    protected String animalClass;

    // Родительский класс "животные"
    protected Animal(String animalClass) {
        this.animalClass = animalClass;
        this.id = UUID.randomUUID().toString();
    }

    protected Animal() {
        this.animalClass = animalClass;
        this.id = UUID.randomUUID().toString();
    }

}
