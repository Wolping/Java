class TableReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        return new TableReport();
    }
}