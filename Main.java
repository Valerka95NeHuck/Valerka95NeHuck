import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NamePhome> people = new ArrayList<NamePhome>();
        System.out.println("Здравствуйте вас приветсвует блокнот имен");
        while (true) {
            System.out.println("Выберите функцию \nДобавить\nЧитать\nУдалить\nCохранить\nИзменить\nВыйти");
            String option = scanner.nextLine();
            switch (option) {
                case ("Добавить"):
                    addPerson(people);
                    break;
                case ("Читать"):
                    for (NamePhome person : people) {
                        System.out.println(person.toString());
                    }
                    break;
                case ("Удалить"):
                    System.out.println("Напиши имя что бы удалить его из списка");
                    for (NamePhome person : people) {
                        System.out.println(person);
                    }
                    String rName = scanner.nextLine();
                    people.remove(rName);
                    break;
              /*  case ("Изменить"):
                    System.out.println("Укажите ячейку для замены");
                    int i = scanner.nextInt();
                    System.out.println("Укажите на что изменить");
                    String Аname = scanner.nextLine();
                    NamePhome namePhone = new NamePhome();
                    namePhone.setName(Aname);
                    people.add(i, );
                    break;


                case ("Сохранить"):
                    for (NamePhome person : people) {
                        FileWriter fileWriter = new FileWriter("filename.txt", true);
                        fileWriter.write(person);
                        fileWriter.append('\n');
                        fileWriter.flush();

                    }

                */
                case ("Выйти"):
                    return;
            }

        }
    }
    public static void addPerson (ArrayList<NamePhome> persons){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько имен добавить в лист?");
        int b = scanner.nextInt();
        System.out.println("Ваши имена");
        for (int i = 0; i <= b; i++) {
            String name = scanner.nextLine();
            String phone = scanner.nextLine();
            NamePhome namePhone = new NamePhome();
            namePhone.setPhome(phone);
            namePhone.setName(name);
            persons.add(namePhone);
        }
        return;
    }
}





