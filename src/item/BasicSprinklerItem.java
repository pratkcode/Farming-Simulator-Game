package item;

import world.entity.BasicSprinkler;

public class BasicSprinklerItem extends SprinklerItem {

	public BasicSprinklerItem() {
		super("res/sprinklerBasicItem.png", "Basic Sprinkler", 20);
	}

	@Override
	public BasicSprinkler makeEntity() {
		return new BasicSprinkler();
	}
}
