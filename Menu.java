import java.util.Scanner;

public class Menu {

    public static void menu(Zoo arr) {
        int arrSize;
        Object elAnimal;
        int start = 1;
        int end = 7;
        while (true) {
            System.out.println(
                    "МЕНЮ\n1. Добавить новое животное\n2. Определить класс животного\n3. Напечатать информацию о животном\n4. Показать всех животных\n5. Заставить животное издать звук\n6. Заставить всех животных издать звук\n7. Выход");
            System.out.println("Введите нужный пункт меню:");

            Scanner in = new Scanner(System.in);
            start = 1;
            end = 7;
            String inputUser = in.nextLine();
            int choice = ValidationInput(inputUser, start, end);
            switch (choice) {
                case 1:
                    System.out.println(
                            "Выберите нужный пункт:\n1. Dog\n2. Cat\n3. Hamsters\n4. Camel\n5. Horse\n6. Donkey\n7. Назад");
                    int x = in.nextInt();
                    switch (x) {
                        case 1:
                            arr.add(new Dogs());
                            break;
                        case 2:
                            arr.add(new Cats());
                            break;
                        case 3:
                            arr.add(new Hamsters());
                            break;
                        case 4:
                            arr.add(new Camel());
                            break;
                        case 5:
                            arr.add(new Horse());
                            break;
                        case 6:
                            arr.add(new Donkey());
                            break;
                        case 7:
                            // menu(storage);
                        default:
                            break;
                    }
                    break;
                case 2:
                    start = 0;
                    end = arr.getSizeArr();

                    System.out.println("Введите индекс нужного животного: ");
                    System.out.println("Длина массива: " + end);
                    inputUser = in.nextLine();
                    int idx = ValidationInput(inputUser, start, end);

                    if (checkedSizeArr(idx, start, end)) {
                        elAnimal = arr.getElemet(idx);
                        System.out.println(elAnimal);
                        // inputUser = in.nextLine();
                        System.out.println(elAnimal.getClass().getSuperclass().getSuperclass());
                    } else {
                        System.out.println();
                        System.out.println("Вы ввели некорректно значение!  Введите цифру в диапазоне от: " + start
                                + " до " + end);
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Введите индекс нужного животного: ");
                    // int indx = in.nextInt();
                    // arr.showAnimal(indx);
                    inputUser = in.nextLine();
                    // end = arrSize;
                    idx = ValidationInput(inputUser, start, end);
                    break;
                case 4:
                    arr.showAll();
                    break;
                case 5:
                    System.out.println("Введите индекс нужного животного:\n");
                    // int index = in.nextInt();
                    // arr.voice(index);

                    inputUser = in.nextLine();
                    // end = arrSize;
                    idx = ValidationInput(inputUser, start, end);
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

    // **Функция принимает строку и диапазон [start :end] и проверяет, что введно
    // число из этого диапазона */
    public static int ValidationInput(String input, int start, int end) {
        int userInt;

        try {
            userInt = Integer.parseInt(input);
            if (userInt != (int) userInt || userInt < start || userInt > end)
                throw new Exception();
        } catch (Exception e) {
            System.out.println(
                    "\nВводить можно только цифры из диапазона меню!" + " от " + start + " до " + end
                            + "\nПовторите ввод!\n");
            userInt = -1;
            // SelectMenu(View2.ShowMenu());
        }

        return userInt;
    }

    // Метод проверяет что пользоваетль ввёл число из диапазона от 0 до длины
    // массива arrSize
    public static boolean checkedSizeArr(int arrSize, int start, int end) {
        if (arrSize <= end && arrSize >= start) {
            return true;
        } else {
            return false;
        }
    }

}