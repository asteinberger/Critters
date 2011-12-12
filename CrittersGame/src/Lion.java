import java.awt.*;

public class Lion extends Critter {
	
	private int numMove = 0;
	private boolean inFight = false;
	
	public Lion() {
	}
	
	public boolean eat() {
		if (this.inFight) {
			this.inFight = false;
			return true;
		} else {
			return false;
		}
	}
	
	public Attack fight(String opponent) {
		this.inFight = true;
		if (opponent.equals("B")) {
			return Attack.ROAR;
		} else {
			return Attack.POUNCE;
		}
	}
	
	public Direction getMove() {
		if (this.numMove < 5) {
			this.numMove++;
			return Direction.SOUTH;
		} else if (this.numMove < 10) {
			this.numMove++;
			return Direction.WEST;
		} else if (this.numMove < 15) {
			this.numMove++;
			return Direction.NORTH;
		} else if (this.numMove < 20) {
			this.numMove++;
			return Direction.EAST;
		} else {
			this.numMove = 0;
			return Direction.SOUTH;
		}
	}

	public Color getColor() {
		return Color.RED;
	}

	public String toString() {
		return "L";
	}
}