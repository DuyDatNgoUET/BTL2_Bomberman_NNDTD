package uet.oop.bomberman.entities.tile.item;

import uet.oop.bomberman.entities.tile.Tile;
import uet.oop.bomberman.graphics.Sprite;

public abstract class Item extends Tile {
	protected boolean active = false;
	protected int level;
	public Item(int x, int y,int _level, Sprite sprite) {
		super(x, y, sprite);
		level = _level;
	}

	public abstract void setValues();

	public int getLevel(){
		return level;
	}

	public boolean isActive(){
		return active;
	}
}
