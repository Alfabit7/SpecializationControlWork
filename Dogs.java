
public class Dogs extends HomeAnimals {

    public Dogs() {
        this.name = getClass().getName();
        this.commands.add("Сидеть");
        this.commands.add("Апорт");
        this.commands.add("Охранять");
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
