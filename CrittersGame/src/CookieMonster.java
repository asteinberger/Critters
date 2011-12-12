import java.awt.*;
import java.util.Random;

public class CookieMonster extends Critter {
	
	private SingletonObject stats;
	private Random r;
	
	public CookieMonster() {
		this.stats = SingletonObject.getSingletonObject();
		this.r = new Random();
	}
	
	public boolean eat() {
		return true;
	}
	
	// TODO if you lose, you know which attack you will win with...
	public Attack fight(String opponent) {
		if (this.stats.getStats(opponent) != null) {
			if (this.stats.getStats(opponent).getWin() != Attack.FORFEIT) {
				return this.stats.getStats(opponent).getWin();
			} else if (this.stats.getStats(opponent).getLose1() != Attack.FORFEIT) {
				if (this.stats.getStats(opponent).getLose1() == Attack.POUNCE) {
					return Attack.ROAR;
				} else if (this.stats.getStats(opponent).getLose1() == Attack.ROAR) {
					return Attack.SCRATCH;
				} else {
					return Attack.POUNCE;
				}
			} else {
				int rand = this.r.nextInt(3);
				if (rand == 0) {
					return Attack.POUNCE;
				} else if (rand == 1) {
					return Attack.ROAR;
				} else {
					return Attack.SCRATCH;
				}
			}
		} else {
			return Attack.POUNCE;
		}
	}
	
	public Direction getMove() {
		this.setAlive(true);
		int rand = this.r.nextInt(4);
		if (rand == 0) {
			return Direction.EAST;
		} else if (rand == 1) {
			return Direction.NORTH;
		} else if (rand == 2) {
			return Direction.SOUTH;
		} else {
			return Direction.WEST;
		}
	}

	public Color getColor() {
		return Color.ORANGE;
	}

	public String toString() {
		return "ಠ_ಠ";
	}
	
}