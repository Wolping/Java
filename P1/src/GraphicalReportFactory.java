class GraphicalReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        return new GraphicalReport();
    }
}