class TextReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        return new TextReport();
    }
}