class HomeMicrophone implements Microphone {
    @Override
    public void recordSound() {
        System.out.println("Домашний микрофон записывает звук");
    }
}