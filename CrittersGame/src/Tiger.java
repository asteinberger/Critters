import java.awt.*;
import java.util.Random;

public class Tiger extends Critter {
	
	private int numEats;
	private int numMove = 0;
	private Random r;
	private int rand;
	
	public Tiger(int hunger) {
		this.numEats = hunger;
		this.r = new Random();
		this.rand = this.r.nextInt(4);
	}
	
	public boolean eat() {
		if (this.numEats > 0) {
			this.numEats--;
			return true;
		} else {
			return false;
		}
	}
	
	public Attack fight(String opponent) {
		if (this.numEats > 0) {
			return Attack.SCRATCH;
		} else {
			return Attack.POUNCE;
		}
	}
	
	public Direction getMove() {
		if (this.numMove < 3) {
			this.numMove++;
			if (this.rand == 0) {
				return Direction.WEST;
			} else if (this.rand == 1) {
				return Direction.NORTH;
			} else if (this.rand == 2) {
				return Direction.EAST;
			} else {
				return Direction.SOUTH;
			}
		} else {
			this.numMove = 0;
			this.rand = this.r.nextInt(4);
			if (this.rand == 0) {
				return Direction.WEST;
			} else if (this.rand == 1) {
				return Direction.NORTH;
			} else if (this.rand == 2) {
				return Direction.EAST;
			} else {
				return Direction.SOUTH;
			}
		}
	}

	public Color getColor() {
		return Color.YELLOW;
	}

	public String toString() {
		return Integer.toString(numEats);
	}
}