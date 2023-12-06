abstract class ImageProcessorTemplate {
    public final void processImage(String imagePath) {
        loadImage(imagePath);

        applyFilter();

        saveImage();
    }
    private void loadImage(String imagePath) {
        System.out.println("Загрузка изображения из файла: " + imagePath);
    }
    protected abstract void applyFilter();
    private void saveImage() {
        System.out.println("Сохранение обработанного изображения");
    }
}
