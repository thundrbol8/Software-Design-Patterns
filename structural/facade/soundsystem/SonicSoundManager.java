package structural.facade.soundsystem;

public class SonicSoundManager implements SoundManager {

  @Override
  public void on() {
    System.out.println("Setting Sonic Sound System");
  }

  @Override
  public void playSound() {
    System.out.println("Playing Sonic Sound System");
  }
}
