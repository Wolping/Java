
class WeeklyReport implements ReportPrototype {
    private String content;

    public WeeklyReport(String content) {
        this.content = content;
    }

    @Override
    public ReportPrototype clone() {
        return new WeeklyReport(this.content);
    }

    @Override
    public void generateReport() {
        System.out.println("Генерация еженедельного отчета: " + content);
    }
}
