package behavioral.template;

import behavioral.template.templatemethods.CSVExporter;
import behavioral.template.templatemethods.PDFExporter;
import behavioral.template.templatemethods.ReportExporter;
import behavioral.template.templatemethods.TextExporter;

public class TemplatePatternApplication {

  public static void main(String[] args) {
    ReportExporter pdfExporter = new PDFExporter();
    pdfExporter.exportReport();

    ReportExporter csvExporter = new CSVExporter();
    csvExporter.exportReport();

    ReportExporter textExporter = new TextExporter();
    textExporter.exportReport();
  }
}
