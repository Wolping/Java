public class ReportGenerator {
    public static void main(String[] args) {
        ReportFactory graphicalFactory = new GraphicalReportFactory();
        Report graphicalReport = graphicalFactory.createReport();
        graphicalReport.generate();

        ReportFactory tableFactory = new TableReportFactory();
        Report tableReport = tableFactory.createReport();
        tableReport.generate();

        ReportFactory textFactory = new TextReportFactory();
        Report textReport = textFactory.createReport();
        textReport.generate();
    }
}