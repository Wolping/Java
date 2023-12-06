class HomeAudioDeviceFactory implements AudioDeviceFactory {
    @Override
    public Headphones createHeadphones() {
        return new HomeHeadphones();
    }

    @Override
    public Speakers createSpeakers() {
        return new HomeSpeakers();
    }

    @Override
    public Microphone createMicrophone() {
        return new HomeMicrophone();
    }
}