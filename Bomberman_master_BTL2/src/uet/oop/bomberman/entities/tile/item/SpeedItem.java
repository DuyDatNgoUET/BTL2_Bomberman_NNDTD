package uet.oop.bomberman.entities.tile.item;

import uet.oop.bomberman.Board;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.graphics.Sprite;

public class SpeedItem extends Item {
	protected Board _board;
	public SpeedItem(int x, int y, Sprite sprite, Board board) {
		super(x, y, sprite);
		_board = board;
	}

	@Override
	public boolean collide(Entity e) {
		// TODO: xử lý Bomber ăn Item

		return false;
	}
}
