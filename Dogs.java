import java.time.LocalDate;
import java.util.ArrayList;

public class Dogs extends HomeAnimals {

    public Dogs() {
        this.id = id;
        this.animalClass = animalClass;
        this.name = name;
        this.dateOfBirthDay = LocalDate.now();
        this.commands.add("Сидеть");
        this.commands.add("Апорт");
        this.commands.add("Охранять");
    }

    @Override
    public String toString() {

        return String.format(super.toString());
    }

}
