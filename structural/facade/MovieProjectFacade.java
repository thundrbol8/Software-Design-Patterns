package structural.facade;

import structural.facade.dvdplayer.DVDPlayerManager;
import structural.facade.projector.ProjectorManager;
import structural.facade.soundsystem.SoundManager;

public class MovieProjectFacade {
  DVDPlayerManager dvdPlayerManager;
  ProjectorManager projectorManager;
  SoundManager soundManager;

  public MovieProjectFacade (
    DVDPlayerManager dvdPlayerManager, ProjectorManager projectorManager, SoundManager soundManager) {

    this.dvdPlayerManager = dvdPlayerManager;
    this.projectorManager = projectorManager;
    this.soundManager = soundManager;
  }

  public void startMovie(String movieName) {
    System.out.println("Starting playing movie " + movieName);

    dvdPlayerManager.onPlayer();
    dvdPlayerManager.startPlayer();

    soundManager.on();
    soundManager.playSound();

    projectorManager.onProjector();
    projectorManager.project();

    System.out.println("Projecting movie " + movieName + ". Enjoy!");
  }
}
