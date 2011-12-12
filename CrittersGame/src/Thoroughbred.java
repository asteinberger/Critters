import java.awt.*;
import java.util.Random;

public class Thoroughbred extends Critter {

	private int numMove = 0;
	private Random r;
	private int rand;

	public Thoroughbred() {
		this.r = new Random();
		this.rand = this.r.nextInt(4);
	}

	public boolean eat() {
		return true;
	}

	public Attack fight(String opponent) {
		if (opponent.matches("\\d+")) {
			if (Integer.parseInt(opponent) == 0) {
				return Attack.SCRATCH;
			} else {
				return Attack.ROAR;
			}
		} else if (opponent.equals("L")) {
			return Attack.SCRATCH;
		} else if (opponent.equals("B")) {
			return Attack.ROAR;
		} else {
			int guess = this.r.nextInt(3);
			if (guess == 0) {
				return Attack.SCRATCH;
			} else if (guess == 1) {
				return Attack.POUNCE;
			} else {
				return Attack.ROAR;
			}
		}
	}

	public Direction getMove() {
		if (this.numMove < 6) {
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
		return Color.BLUE;
	}

	public String toString() {
		return "^_^";
	}
}