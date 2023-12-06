class SomeClass {
    public void doSomething() {
        AppSettings appSettings = AppSettings.getInstance();

        appSettings.setSetting("language", "English");
        String language = appSettings.getSetting("language");

        System.out.println("Language setting: " + language);
    }
}
