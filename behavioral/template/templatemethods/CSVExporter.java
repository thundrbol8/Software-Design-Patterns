package behavioral.template.templatemethods;

public class CSVExporter extends ReportExporter {

  public void addHeader() {
    System.out.println("Adding header for CSV");
  }

  public void writeData() {
    System.out.println("Writing to CSV");
  }

  public void addFooter() {
    System.out.println("Adding footer for CSV");
  }
}
