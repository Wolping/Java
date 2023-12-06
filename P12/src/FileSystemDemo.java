
public class FileSystemDemo {
    public static void main(String[] args) {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");


        Folder folder1 = new Folder("Папка 1");
        Folder folder2 = new Folder("Папка 2");

        folder1.addComponent(file1);
        folder1.addComponent(file2);

        folder2.addComponent(file3);


        Folder mainFolder = new Folder("Главная папка");
        mainFolder.addComponent(folder1);
        mainFolder.addComponent(folder2);

        mainFolder.showDetails();
    }
}
