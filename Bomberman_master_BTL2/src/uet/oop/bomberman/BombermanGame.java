package uet.oop.bomberman;

import sound.GameSoundLoop;
import uet.oop.bomberman.gui.Frame;

public class BombermanGame {

	
	public static void main(String[] args)
    {
        GameSoundLoop theme = new GameSoundLoop("play_game.wav");
		new Frame();
	}
}
