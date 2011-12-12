import java.awt.*;

public class Bear extends Critter {
	
	private boolean isNorth = true;
	private boolean isGrizzly;
	
	public Bear(boolean grizzly) {
		this.isGrizzly = grizzly;
	}
	
	public boolean eat() {
		return true;
	}
	
	public Attack fight(String opponent) {
		return Attack.SCRATCH;
	}
	
	public Direction getMove() {
		if (this.isNorth) {
			this.isNorth = !this.isNorth;
			return Direction.NORTH;
		} else {
			this.isNorth = !this.isNorth;
			return Direction.WEST;
		}
	}

	public Color getColor() {
		if (this.isGrizzly) {
			return new Color(190,110,50);
		} else {
			return Color.WHITE;
		}
	}

	public String toString() {
		return "B";
	}
}