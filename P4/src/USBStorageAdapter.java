class USBStorageAdapter implements StorageDevice {
    private USBStorage usbStorage;

    public USBStorageAdapter(USBStorage usbStorage) {
        this.usbStorage = usbStorage;
    }

    @Override
    public void readData() {
        usbStorage.plugInUSB();
        usbStorage.transferDataViaUSB();
        System.out.println("Чтение данных с USB-накопителя");
    }

    @Override
    public void writeData() {
        usbStorage.plugInUSB();
        usbStorage.transferDataViaUSB();
        System.out.println("Запись данных на USB-накопитель");
    }
}