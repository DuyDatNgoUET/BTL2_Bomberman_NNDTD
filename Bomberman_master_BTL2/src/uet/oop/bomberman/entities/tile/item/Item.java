package uet.oop.bomberman.entities.tile.item;

import uet.oop.bomberman.Board;
import uet.oop.bomberman.entities.tile.Tile;
import uet.oop.bomberman.graphics.Sprite;

public abstract class Item extends Tile {

	protected int _duration = -1 ; // thời lượng
	protected boolean _active = false;  // hoạt động
	protected  int _level; // level

	public Item(int x, int y,int level, Sprite sprite) {
		super(x, y, sprite);
		_level = level;
	}

/*

	public abstract void setValues();

	public int getLevel(){
		return _level;
	}

	public boolean isActive(){
		return _active;
	}*/


}
