package structural.facade.dvdplayer;

public class SonicDVDPlayer implements DVDPlayerManager {

  @Override
  public void onPlayer() {
    System.out.println("Turning on Sonic DVD Player");
  }

  @Override
  public void startPlayer() {
    System.out.println("Starting Sonic DVD Player");
  }

}
