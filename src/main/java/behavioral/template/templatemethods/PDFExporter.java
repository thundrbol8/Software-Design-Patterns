package behavioral.template.templatemethods;

public class PDFExporter extends ReportExporter {

  public void addHeader() {
    System.out.println("Adding header for PDF");
  }

  public void writeData() {
    System.out.println("Writing to PDF");
  }

  public void addFooter() {
    System.out.println("Adding footer for PDF");
  }
}
