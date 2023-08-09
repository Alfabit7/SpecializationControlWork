
public class Cats extends HomeAnimals {

    public Cats() {
        this.name = getClass().getName();
        this.commands.add("Мяукать");
        this.commands.add("Ласкаться");
        this.commands.add("Играть");
    }

    @Override
    public String toString() {
        StringBuilder command = new StringBuilder();
        for (String string : commands) {
            command.append(string + " ");
        }
        command.toString();
        return String.format("%sname: %s\ncommand: %s\n", super.toString(), name, command);
    }

}
