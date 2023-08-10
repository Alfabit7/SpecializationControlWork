import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animals> animals = new ArrayList<>();

    public int getSizeArr() {
        return animals.size();
    }

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

    public Object getElemet(int idx) {
        return animals.get(idx);
    }

    public void saveToFile() {

        String filename = "list.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Animals animal : animals) {
                writer.write(animal.toString());
                writer.newLine();
            }
            System.out.println("Список животных успешно сохранен в файл " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении списка животных: " +
                    e.getMessage());
        }
    }

}