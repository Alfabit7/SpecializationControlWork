
public class Camel extends PackAnimals {

    public Camel() {
        this.name = getClass().getName();
        this.commands.add("Жевать");
        this.commands.add("Смотреть");
        this.commands.add("Плевать");
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
