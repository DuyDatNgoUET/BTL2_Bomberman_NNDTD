package sound;

import uet.oop.bomberman.level.FileLevelLoader;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class GameSoundLoop   {
    public GameSoundLoop(String name) {


        try {
            URL path = FileLevelLoader.class.getResource("/sounds/" + name);
            File file = new File(path.getPath());
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
            clip.open(inputStream);
            clip.loop(5);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static  void main(String []args){
        GameSoundLoop new2 = new GameSoundLoop("bomber_die.wav");
    }

}
