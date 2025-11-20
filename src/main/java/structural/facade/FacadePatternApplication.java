package structural.facade;

import structural.facade.dvdplayer.DVDPlayerManager;
import structural.facade.dvdplayer.SonicDVDPlayer;
import structural.facade.projector.ProjectorManager;
import structural.facade.projector.SonicProjectManager;
import structural.facade.soundsystem.SonicSoundManager;
import structural.facade.soundsystem.SoundManager;

public class FacadePatternApplication {

  public static void main(String[] args) {

    DVDPlayerManager dvdPlayerManager = new SonicDVDPlayer();
    SoundManager soundManager = new SonicSoundManager();
    ProjectorManager projectorManager = new SonicProjectManager();

    MovieProjectFacade movieProjectFacade = new MovieProjectFacade(dvdPlayerManager, projectorManager, soundManager);
    movieProjectFacade.startMovie("Inception");
  }

}
