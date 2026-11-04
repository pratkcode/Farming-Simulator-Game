package item;

import world.entity.Sprinkler;

public abstract class SprinklerItem extends Item {

	public SprinklerItem(String imagePath, String name, int cost) {
		super(imagePath, name, cost);
	}

	// The sprinkler that gets placed on the map when this item is used
	@Override
	public abstract Sprinkler makeEntity();

	@Override
	public void clicked(Item selectedItem) {
	}
}
