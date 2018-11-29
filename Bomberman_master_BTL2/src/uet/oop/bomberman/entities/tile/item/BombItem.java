package uet.oop.bomberman.entities.tile.item;

import sound.GameSoundOne;
import uet.oop.bomberman.Game;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.graphics.Sprite;

public class BombItem extends Item {

	public BombItem(int x, int y,int live, Sprite sprite) {
		super(x, y,live, sprite);
	}

	@Override
	public void setValues() {
		active = true;
		Game.addBombRate(1);
	}

	@Override
	public boolean collide(Entity e) {
		// TODO: xử lý Bomber ăn Item
		if(e instanceof Bomber){
			GameSoundOne item = new GameSoundOne("item.wav");
			((Bomber)e).addItem(this);
			remove();
			return true;

		}
		return false;
	}
	


}
