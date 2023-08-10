import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Animals {
    protected String id;
    protected String animalClass;
    protected List<String> commands = new ArrayList<>();

    // Родительский класс "животные"
    protected Animals(String animalClass) {
        this.animalClass = animalClass;
        this.id = UUID.randomUUID().toString();
    }

    protected Animals() {
        this.animalClass = animalClass;
        this.id = UUID.randomUUID().toString();
    }

    protected void setClassAnimal(String inputClass) {
        this.animalClass = inputClass;
    }

    protected void showCommands() {
        for (String string : commands) {
            System.out.print(string + " ");
        }
    }

    @Override
    public String toString() {
        return String.format("id: %s: ", id);
    }

}
