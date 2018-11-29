package uet.oop.bomberman.entities.tile;

import sound.GameSoundOne;
import uet.oop.bomberman.Board;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.graphics.Sprite;

public class Portal extends Tile {
	Board _board;
	public Portal(int x, int y, Sprite sprite, Board board) {
		super(x, y, sprite);
		_board = board;
	}
	
	@Override
	public boolean collide(Entity e) {
		// TODO: xử lý khi Bomber đi vào
		/*if(e instanceof Bomber){
			if(_board.detectNoEnemies()==false){
				return false;
			}
			if(e.getXTile()== getX() && e.getYTile()== getY()){
				if(_board.detectNoEnemies()){
					GameSoundOne item = new GameSoundOne("item.wav");
					_board.nextLevel();
				}
			}
			return true;
		}
		return false;*/

		if (e instanceof Bomber ){
			if (Bomber.getBombNumber()==0) {
				if (_board.detectNoEnemies()) {
					GameSoundOne item = new GameSoundOne("item.wav");
					_board.nextLevel();
				}
			}
		}
		return false;
	}

}
