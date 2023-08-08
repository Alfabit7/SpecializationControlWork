import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HomeAnimals extends Animal {
    protected String name;
    protected LocalDate dateOfBirthDay;
    private List<String> commands = new ArrayList<>();

    protected HomeAnimals() {
        this.name = name;
        this.dateOfBirthDay = LocalDate.now();
        this.commands = new ArrayList<>();
    }

    @Override
    public String toString() {

        return String.format("name %s\ndateOfBirthDay: %D", super.toString(), name, dateOfBirthDay);

    }

}