
public class Hamsters extends HomeAnimals {

    public Hamsters() {
        this.name = getClass().getName();
        this.commands.add("Спать");
        this.commands.add("Бежать");
        this.commands.add("Есть");
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
