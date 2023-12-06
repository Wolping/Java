public class MusicPlayerApp {
    public static void main(String[] args) {
        Remote remote = new BasicRemote();

        Device player = new Player();
        Device speakers = new Speakers();
        Device headphones = new Headphones();

        remote.setDevice(player);
        remote.powerOn();
        remote.play();
        remote.powerOff();

        remote.setDevice(speakers);
        remote.powerOn();
        remote.play();
        remote.powerOff();

        remote.setDevice(headphones);
        remote.powerOn();
        remote.play();
        remote.powerOff();
    }
}