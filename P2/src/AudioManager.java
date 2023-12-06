public class AudioManager {
    public static void main(String[] args) {
        AudioDeviceFactory homeFactory = new HomeAudioDeviceFactory();
        Headphones homeHeadphones = homeFactory.createHeadphones();
        homeHeadphones.playSound();

        Speakers homeSpeakers = homeFactory.createSpeakers();
        homeSpeakers.playSound();

        Microphone homeMicrophone = homeFactory.createMicrophone();
        homeMicrophone.recordSound();

        AudioDeviceFactory professionalFactory = new ProfessionalAudioDeviceFactory();
        Headphones professionalHeadphones = professionalFactory.createHeadphones();
        professionalHeadphones.playSound();

        Speakers professionalSpeakers = professionalFactory.createSpeakers();
        professionalSpeakers.playSound();

        Microphone professionalMicrophone = professionalFactory.createMicrophone();
        professionalMicrophone.recordSound();
    }
}