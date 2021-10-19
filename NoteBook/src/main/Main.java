package main;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static String Main (){
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        return option ;
    }


    public Main() {

    }

    public static void main(String[] args) throws Exception {
        ArrayList<NamePhone> people = new ArrayList<NamePhone>();
        System.out.println("Здравствуйте вас приветсвует блокнот клиентов");
        while (true) {
            System.out.println("Выберите функцию \nдобавить\nчитать\nудалить\nсохранить\nизменить\nвыйти");
            try {
                switch (Main()) {
                    case ("добавить"):
                        addPersons(people);
                        break;
                    case ("читать"):
                        showPersons(people);
                        break;
                    case ("удалить"):
                        removePerson(people);
                        break;
              /* case ("Изменить"):
                    System.out.println("Укажите ячейку для замены");
                    int i = scanner.nextInt();
                    System.out.println("Укажите на что изменить");
                    String Аname = scanner.nextLine();
                    NamePhome namePhone = new NamePhome();
                    namePhone.setName(Aname);
                    people.add(i, );
                    break;

               case ("Сохранить"):
                    SaveInfo(people);
                    break;


               */

                    case ("выйти"):
                        return;

                }
            }catch (Exception ex){
                System.out.println(ex);

            }

        }
    }
    /* public static void SaveInfo (ArrayList<NamePhome>persons) throws IOException {

        for (NamePhome person : people) {
            FileWriter fileWriter = new FileWriter("SafeTest.txt", true);
            NamePhome namePhone = new NamePhome();
            fileWriter.write(namePhone.getName());
            fileWriter.append('\n');
            fileWriter.flush();
        }
        return;
    }

     */
    public static void addPersons (ArrayList<NamePhone> persons) {

        // сделал второй сканер для того что бы не вылетал баг с заполняемостью данных
        // когда работает один сканер то он обрабатывает 1 значение а второе пропускает пока не понимаю почему.
        ;
        System.out.println("Вы точно хотите добавить контакт-Да/Нет");
        while (true) {

            switch (Main()) {
                case ("Да"):
                    try {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Сколько клиентов добавить в список?");
                        int b = scanner.nextInt();
                        System.out.println("Контакты");
                        for (int i = 0; i < b; i++) {
                            System.out.println(i + 1 + ")" + " Имя клиента:");
                            String name = Main();

                            System.out.println(i + 1 + ")" + " Телефон клиента:");
                            String phone = Main();

                            NamePhone namePhone = new NamePhone(name,phone);
                            persons.add(i, namePhone);

                        }
                    } catch (Exception e1) {
                        e1.getMessage();
                        System.out.println("Попробуй снова!!!!");
                    }
                    System.out.println("Контакты добавлены!");
                    System.out.println("Повторить ? Да/Нет");
                    break;
                case ("Нет"):
                    return;
            }
        }
    }

    public static void removePerson  (ArrayList<NamePhone> people) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Точно хотите удалить? Y/N");
            switch (Main()) {
                case ("Y"):
                    try {
                        System.out.print("Напиши номер строки: ");
                        int b = scanner.nextInt() - 1;
                        showPersons(people);
                        people.remove(b);
                        b = b + 1;
                        System.out.println("Строка" + "#"+ b + " удалена! Повторить Y/N?");
                    } catch (Exception e2) {
                        System.out.println("Укажите цифру больше 0");
                    }
                    break;
                case ("N"):
                    return;


            }
        }
    }
    public static void showPersons (ArrayList<NamePhone>people){ // метод для просмотра данных (есть небольшая проблема хочу что бы выставлялась цифра перед каждой строкой:
        for (NamePhone person : people) {
                System.out.println(person);
        }
        return;
    }

    public class Storage  implements Cloneable {




        }
    }






