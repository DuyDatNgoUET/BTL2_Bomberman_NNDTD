package sound;

import uet.oop.bomberman.level.FileLevelLoader;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;


public class GameSoundOne extends  JFrame  {

    public GameSoundOne(String name) {


        try {
            URL path = FileLevelLoader.class.getResource("/sounds/" + name);
            File file = new File(path.getPath());
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
            clip.open(inputStream);
            clip.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    public static  void main(String []args){
        GameSoundOne new1 = new GameSoundOne("game_over.wav");
    }
}

