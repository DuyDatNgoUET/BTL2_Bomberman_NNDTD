package uet.oop.bomberman.entities.tile.item;

import uet.oop.bomberman.Board;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.graphics.Sprite;

public class BombItem extends Item {



	public BombItem(int x, int y,int level, Sprite sprite) {
		super(x, y,level , sprite);

	}


	@Override
	public boolean collide(Entity e) {
		// TODO: xử lý Bomber ăn Item

		return false;
	}
}
