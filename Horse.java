
public class Horse extends PackAnimals {

    public Horse() {
        this.name = getClass().getName();
        this.commands.add("Но");
        this.commands.add("Бррр");
        this.commands.add("Вперед");
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
