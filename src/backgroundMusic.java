import javax.sound.sampled.*;
import javax.swing.*;
import java.io.*;

public class backgroundMusic {
  public void musicPlayer(String name) {
    if (name.equals("background")) {
      try {
        File music = new File("");
        AudioInputStream audio = AudioSystem.getAudioInputStream(music);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);
        clip.start();
        clip.loop(9);

      } catch (UnsupportedAudioFileException | IOException e) {
        e.printStackTrace();
      } catch (LineUnavailableException e) {
        e.printStackTrace();
      }
    }
    if(name.equals("effect")){
      try {
        File music = new File("");
        AudioInputStream audio = AudioSystem.getAudioInputStream(music);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);
        clip.start();

      } catch (UnsupportedAudioFileException | IOException e) {
        e.printStackTrace();
      } catch (LineUnavailableException e) {
        e.printStackTrace();
      }
    }
  }
}
