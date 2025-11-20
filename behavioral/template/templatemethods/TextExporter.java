package behavioral.template.templatemethods;

public class TextExporter extends ReportExporter {

  public void addHeader() {
    System.out.println("Adding header for Text");
  }

  public void writeData() {
    System.out.println("Writing to Text");
  }

  public void addFooter() {
    System.out.println("Adding footer for Text");
  }
}
