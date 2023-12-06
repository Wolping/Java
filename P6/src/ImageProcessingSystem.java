public class ImageProcessingSystem {
    public static void main(String[] args) {
        ImageProcessorTemplate blackAndWhiteFilter = new BlackAndWhiteFilter();
        blackAndWhiteFilter.processImage("input_image.jpg");

        System.out.println();

        ImageProcessorTemplate sepiaFilter = new SepiaFilter();
        sepiaFilter.processImage("input_image.jpg");

        System.out.println();

        ImageProcessorTemplate sharpenFilter = new SharpenFilter();
        sharpenFilter.processImage("input_image.jpg");
    }
}