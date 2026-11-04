package world.entity;

import java.util.ArrayList;

import world.Cell;

public abstract class Sprinkler extends Entity {

	public abstract void waterCells(ArrayList<Cell> neighbors);
}
