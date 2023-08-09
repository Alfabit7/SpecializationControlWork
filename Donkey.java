
public class Donkey extends PackAnimals {

    public Donkey() {
        this.name = getClass().getName();
        this.commands.add("Тащить");
        this.commands.add("Стоять");
        this.commands.add("Голос");
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
