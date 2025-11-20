package structural.facade.projector;

public class SonicProjectManager implements ProjectorManager {

  public void onProjector() {
    System.out.println("Turning on Sonic Projector");
  }
  public void project() {
    System.out.println("Starting Projecting Movie");
  }
}
