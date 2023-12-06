
class MonthlyReport implements ReportPrototype {
    private String content;

    public MonthlyReport(String content) {
        this.content = content;
    }

    @Override
    public ReportPrototype clone() {
        return new MonthlyReport(this.content);
    }

    @Override
    public void generateReport() {
        System.out.println("Генерация ежемесячного отчета: " + content);
    }
}
