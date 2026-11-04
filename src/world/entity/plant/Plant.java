
package world.entity.plant;


import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SpriteSheet;

import item.Item;
import world.Cell;
import world.entity.Entity;
import world.terrain.Terrain;

public abstract class Plant extends Entity {

    protected int daysGrown;
    protected int maturity; // days to grow; each plant has its own (was static, so all crops shared one value)
    protected SpriteSheet sheet;

    public boolean isMature() {
        return daysGrown >= maturity;
    }

    public float percentMaturity() {
        return (float) daysGrown / maturity;
    }
    
    public abstract void setImage(); 
    

    @Override
    public void render(Graphics g) {
    	int w = Cell.getWidth();
    	int h = Cell.getHeight();

        if (sheet != null) {
            sheet.getSprite(0, 0).draw(cell.getX() * w, cell.getY() * h, w, h);
        }
        
    }

	public void clicked(Item selectedItem) {
		// TODO Auto-generated method stub
		
	}
	
	 @Override
	 public abstract void nextDay();
}


