package main;
import java.lang.management.MemoryNotificationInfo;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NamePhome> people = new ArrayList<NamePhome>();
        System.out.println("Здравствуйте вас приветсвует блокнот клиентов");
        while (true) {
            System.out.println("Выберите функцию \nДобавить\nЧитать\nУдалить\nCохранить\nИзменить\nВыйти");
            try {
                String option = scanner.nextLine();
                switch (option) {
                    case ("Добавить"):
                        addPerson(people);
                        break;
                    case ("Читать"):
                        seePersons(people);
                        break;
                    case ("Удалить"):
                        removePerson(people);
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
            }catch (Exception ex){

            }

        }
    }
    public static void addPerson (ArrayList<NamePhome> persons) {
        System.out.println("Сколько клиентов добавить в список?");  // сделал второй сканер для того что бы не вылетал баг с заполняемостью данных
            Scanner scanner = new Scanner(System.in);// когда работает один сканер то он обрабатывает 1 значение а второе пропускает пока не понимаю почему.
            Scanner indicated = new Scanner(System.in);
            try {
                int b = scanner.nextInt();
                System.out.println("Контакты");
                for (int i = 0; i < b; i++) {
                    System.out.println(i + 1 + ")" + " Имя клиента:");
                    String name = indicated.nextLine();
                    System.out.println(i + 1 + ")" + " Телефон клиента:");
                    String phone = indicated.nextLine();
                    NamePhome namePhone = new NamePhome();
                    namePhone.setInfo(name, phone);
                    persons.add(i, namePhone);

                }
            } catch (Exception e1) {
                System.out.println("Попробуй снова!!!!");
            }
            return;
        }

    public static void removePerson  (ArrayList<NamePhome> people) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Точно хотите удалить? Y/N"); // беда выпригивает два раза когда идешь на второй круг
            String YN = scanner.nextLine();
            switch (YN) {
                case ("Y"):
                    seePersons(people);
                    System.out.print("Напиши номер строки: ");
                    try {
                        int b = scanner.nextInt() - 1;
                        people.remove(b);
                    } catch (Exception e2) {
                        System.out.println("Укажите цифру больше 0");
                    }
                    break;
                case ("N"):
                    return;


            }
        }
    }
    public static void seePersons (ArrayList<NamePhome>people){ // метод для просмотра данных (есть небольшая проблема хочу что бы выставлялась цифра перед каждой строкой:
        for (NamePhome person : people) {
                System.out.println(person);
        }
        return;
    }
}
