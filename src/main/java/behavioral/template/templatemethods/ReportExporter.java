package behavioral.template.templatemethods;

public abstract class ReportExporter {
  public void exportReport() {
    System.out.println("Starting exporting report...");
    readData();
    openFile();
    addHeader();
    writeData();
    addFooter();
    closeFile();
    System.out.println();
  }

  public void readData() {
    System.out.println("Reading data to be exported");
  }

  public void openFile() {
    System.out.println("Opening file to write data");
  }

  public void closeFile() {
    System.out.println("Closing file to write data");
  }

  /***
   * Template methods, where responsibility will be delegated to child classes
   */

  public abstract void addHeader();

  public abstract void writeData();

  public abstract void addFooter();

}
