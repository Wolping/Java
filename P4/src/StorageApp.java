public class StorageApp {
    public static void main(String[] args) {
        StorageDevice usbAdapter = new USBStorageAdapter(new USBStorage());
        StorageDevice sdAdapter = new SDStorageAdapter(new SDStorage());

        usbAdapter.writeData();
        usbAdapter.readData();

        sdAdapter.writeData();
        sdAdapter.readData();
    }
}