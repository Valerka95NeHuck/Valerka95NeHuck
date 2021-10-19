import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> people = new ArrayList<String>();
        int ex = 0;
        System.out.println("Здравствуйте вас приветсвует блокнот имен");
        for (int ex1 =1;ex1 != ex ; ) {
        System.out.println("Выберите функцию \nДобавить\nЧитать\nУдалить\nCохранить\nИзменить");
        String option = scanner.nextLine();
        switch (option) {
            case ("Добавить"):
                System.out.println("Сколько имен добавить в лист?");
                int b = scanner.nextInt();
                System.out.println("Ваши имена");
                for (int i = 0; i <= b; i++) {
                    String name = scanner.nextLine();
                    people.add(name);
                }
                break;
            case ("Читать"):
                for (String person : people) {
                    System.out.println(person);
                }
                break;
            case ("Удалить"):
                System.out.println("Напиши имя что бы удалить его из списка");
                for (String person : people){
                    System.out.println( person);
                }
                String rName = scanner.nextLine();
                people.remove(rName);
                break;
            case ("Изменить"):
                System.out.println("Укажите ячейку для замены");
                int i = scanner.nextInt();
                System.out.println("Укажите на что изменить");
                String Аname = scanner.nextLine();
                people.add(i,Аname);
                break;


            case ("Сохранить"):
                for (String person : people){
                   FileWriter fileWriter = new FileWriter("filename.txt",true);
                   fileWriter.write(person);
                   fileWriter.append('\n');
                   fileWriter.flush();

                }
                System.out.println("Желаете выйти? Нажмите : ноль");
                ex1 = scanner.nextInt();
        }

        }
    }
}





