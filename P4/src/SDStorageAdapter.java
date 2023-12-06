class SDStorageAdapter implements StorageDevice {
    private SDStorage sdStorage;

    public SDStorageAdapter(SDStorage sdStorage) {
        this.sdStorage = sdStorage;
    }

    @Override
    public void readData() {
        sdStorage.insertSDCard();
        sdStorage.transferDataViaSDCard();
        System.out.println("Чтение данных с SD-карты");
    }

    @Override
    public void writeData() {
        sdStorage.insertSDCard();
        sdStorage.transferDataViaSDCard();
        System.out.println("Запись данных на SD-карту");
    }
}