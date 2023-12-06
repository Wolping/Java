import java.util.ArrayList;
import java.util.List;

public class TaskManagerApp {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Подготовить отчет"));
        tasks.add(new Task("Сделать покупки"));
        tasks.add(new Task("Позвонить другу"));

        Caretaker caretaker = new Caretaker();

        TaskListSnapshot initialSnapshot = new TaskListSnapshot(tasks);
        caretaker.saveSnapshot(initialSnapshot);

        tasks.get(0).completeTask();
        tasks.get(2).completeTask();

        System.out.println("Список задач после выполнения некоторых задач:");
        tasks.forEach(System.out::println);

        TaskListSnapshot restoredSnapshot = caretaker.restoreSnapshot();
        if (restoredSnapshot != null) {
            tasks = restoredSnapshot.getTasks();
            System.out.println("\nВосстановлен списк задач:");
            tasks.forEach(System.out::println);
        } else {
            System.out.println("\nНет сохраненного состояния для восстановления.");
        }
    }
}