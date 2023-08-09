import java.util.UUID;

public abstract class Animals {
    protected String id;
    protected String animalClass;

    // Родительский класс "животные"
    protected Animals(String animalClass) {
        this.animalClass = animalClass;
        this.id = UUID.randomUUID().toString();
    }

    protected Animals() {
        this.animalClass = animalClass;
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return String.format("id: %s: ", id);
    }

}
