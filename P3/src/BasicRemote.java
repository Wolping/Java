class BasicRemote implements Remote {
    protected Device device;

    @Override
    public void powerOn() {
        System.out.println("Устройство включено");
    }

    @Override
    public void powerOff() {
        System.out.println("Устройство выключено");
    }

    @Override
    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public void play() {
        device.playMusic();
    }
}