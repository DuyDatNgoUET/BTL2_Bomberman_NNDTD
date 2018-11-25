package uet.oop.bomberman.entities.tile.item;

import uet.oop.bomberman.Board;
import uet.oop.bomberman.Game;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.bomb.Bomb;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.graphics.Sprite;

public class SpeedItem extends Item {
	protected Board _board;
	public SpeedItem(int x, int y,int level, Sprite sprite,Board board ) {
		super(x, y,level, sprite);
		_board = board;
	}

	@Override
	public boolean collide(Entity e) {
		// TODO: xử lý Bomber ăn Item
		if(e instanceof Bomber){
			((Bomber)e).addItem(this);
			remove();
			return true;
		}
		return false;
	}

	@Override
	public void setValues() {
		_active = true ;
		Game.addBomberSpeed(0.2);
	}
}
