
public class ReportManager {
    public static void main(String[] args) {
        WeeklyReport weeklyReport = new WeeklyReport("Данные для еженедельного отчета");
        WeeklyReport clonedWeeklyReport = (WeeklyReport) weeklyReport.clone();
        clonedWeeklyReport.generateReport();

        MonthlyReport monthlyReport = new MonthlyReport("Данные для ежемесячного отчета");

        MonthlyReport clonedMonthlyReport = (MonthlyReport) monthlyReport.clone();
        clonedMonthlyReport.generateReport();
    }
}
