import java.util.Scanner;

public class Menu {

    public static void menu(Zoo arr) {
        while (true) {
            System.out.println(
                    "МЕНЮ\n1. Добавить новое животное\n2. Убрать животное\n3. Напечатать информацию о животном\n4. Показать всех животных\n5. Заставить животное издать звук\n6. Заставить всех животных издать звук\n7. Выход");
            System.out.println("Введите нужный пункт меню:");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(
                            "Выберите нужный пункт:\n1. Dog\n2. Cat\n3. Hamsters\n4. Tiger\n5. Chicken\n6. Stork\n7. Назад");
                    int x = in.nextInt();
                    switch (x) {
                        case 1:
                            arr.add(new Cats());
                            break;
                        case 2:
                            arr.add(new Cats());
                            break;
                        case 3:
                            arr.add(new Hamsters());
                            break;
                        case 4:
                            // arr.add(new Tiger());
                            break;
                        case 5:
                            // arr.add(new Chicken());
                            break;
                        case 6:
                            // arr.add(new Strok());
                            break;
                        case 7:
                            // menu(storage);
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Введите индекс нужного животного:\n");
                    int idx = in.nextInt();
                    // arr.remove(idx);
                    break;
                case 3:
                    System.out.println("Введите индекс нужного животного:\n");
                    int indx = in.nextInt();
                    // arr.showAnimal(indx);
                    break;
                case 4:
                    arr.showAll();
                    break;
                case 5:
                    System.out.println("Введите индекс нужного животного:\n");
                    int index = in.nextInt();
                    // arr.voice(index);
                    break;
                case 6:
                    // arr.voiceAll();
                    break;
                case 7:
                    break;
                default:
                    menu(arr);
                    break;
            }
            if (choice == 7) {
                in.close();
                break;
            }
        }

    }

}