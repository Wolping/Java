package Задание4;
public class Main {
    public static void main (String[] args) {
            String name = new String("Петя");
        String password = new String("123");
        if ( args[0].equals(name) && args[1].equals(password)) {
            System.out.print("Вас узнали. Добро пожаловать");
        } else {
            System.out.print("Логин и пароль не распознаны. Доступ запрещен.");
        }
    }
}