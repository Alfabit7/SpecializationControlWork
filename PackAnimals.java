
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class PackAnimals extends Animals {
    protected String name;
    protected LocalDate dateOfBirthDay = LocalDate.now();
    protected String formattedString;
    protected List<String> commands = new ArrayList<>();

    protected PackAnimals() {
        this.animalClass = "PackAnimal";
        this.name = name;
        this.dateOfBirthDay = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        formattedString = dateOfBirthDay.format(formatter);
        this.commands = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("\nAnimalClass: %s\n%s\n", animalClass, super.toString());
    }

}