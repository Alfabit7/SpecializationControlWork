import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animals> animals = new ArrayList<>();

    public void add(Animals item) {
        this.animals.add(item);
    }

    public void remove(int idxRemove) {
        this.animals.remove(idxRemove);
    }

    public void showAnimal(int index) {
        System.out.println(this.animals.get(index));
    }

    public void showAll() {
        for (Animals animal : animals) {
            System.out.println(animal);
        }
    }
}