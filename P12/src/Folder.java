import java.util.ArrayList;
import java.util.List;


class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Папка: " + name);
        System.out.println("Содержимое:");

        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}
