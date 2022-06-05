package Задание3;
public class Main {
    public static void main (String[] args) {
        if (args.length !=0) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a + b;
            System.out.println(args[0] + " + " + args[1] + " = " + c);
        } else {
            System.out.println("Вы не передавали параметров");
        }

    }
}