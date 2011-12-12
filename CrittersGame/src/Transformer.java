import java.awt.*;
import java.util.Random;

public class Transformer extends Critter {

	private int numEats;
	private int numMove = 0;
	private Random r;
	private int rand;
	private int randCrit;
	private String name;

	public Transformer() {
		this.r = new Random();
		this.rand = this.r.nextInt(4);
		this.numEats = this.r.nextInt(10);
		randName();
	}

	private String randName() {
		String result = "";
		this.randCrit = this.r.nextInt(3);
		if (this.randCrit == 0) {
			result = "B";
		} else if (this.randCrit == 1) {
			result = "L";
		} else {
			result = Integer.toString(this.numEats);
		}
		this.name = result;
		return result;
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
			if (this.randCrit == 0) {
				return Attack.POUNCE;
			} else {
				return Attack.SCRATCH;
			}
		} else if (opponent.equals("B")) {
			return Attack.ROAR;
		}
		if (this.randCrit == 0) {
			return Attack.POUNCE;
		} else if (this.randCrit == 1) {
			return Attack.ROAR;
		} else {
			if (this.numEats > 0) {
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
			randName();
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
		return Color.GRAY;
	}

	public String toString() {
		return this.name;
	}
}