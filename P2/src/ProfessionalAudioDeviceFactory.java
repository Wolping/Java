class ProfessionalAudioDeviceFactory implements AudioDeviceFactory {
    @Override
    public Headphones createHeadphones() {
        return new ProfessionalHeadphones();
    }

    @Override
    public Speakers createSpeakers() {
        return new ProfessionalSpeakers();
    }

    @Override
    public Microphone createMicrophone() {
        return new ProfessionalMicrophone();
    }
}
