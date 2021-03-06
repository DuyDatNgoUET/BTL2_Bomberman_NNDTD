package uet.oop.bomberman.entities.tile.item;

import uet.oop.bomberman.Board;
import uet.oop.bomberman.Game;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.graphics.Sprite;

public class FlameItem extends Item {
	Board board;
	public FlameItem(int x, int y, int _level, Sprite sprite, Board _board) {
		super(x, y,_level, sprite);
		board = _board;
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
		active = true;
		Game.addBombRadius(1);
	}
}
