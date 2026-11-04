package world.entity;

import java.util.ArrayList;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import item.Item;
import world.Cell;
import world.terrain.Dirt;
import world.terrain.Terrain;
import world.terrain.Water;

// Waters the four tiles around it at the start of each day.
public class BasicSprinkler extends Sprinkler {

	public BasicSprinkler() {
		try {
			image = new Image("res/sprinklerBasicEntity.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void waterCells(ArrayList<Cell> neighbors) {
		for (Cell neighbor : neighbors) {
			Terrain terrain = neighbor.getTerrain();
			if (terrain instanceof Dirt) {
				((Dirt) terrain).waterSoil();
			}
		}
	}

	@Override
	public boolean isValid(Terrain t) {
		return !(t instanceof Water);
	}

	@Override
	public void clicked(Item selectedItem) {
	}

	@Override
	public void nextDay() {
		if (cell != null) {
			waterCells(cell.getFourNeighbors());
		}
	}

	@Override
	public void render(Graphics g) {
		if (image != null && cell != null) {
			image.draw(cell.getXPixel(), cell.getYPixel(), Cell.getWidth(), Cell.getHeight());
		}
	}
}
