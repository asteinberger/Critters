
public class CritterStats {
	
	private Critter.Attack win;
	private Critter.Attack lose1;
	private Critter.Attack lose2;
	
	public CritterStats() {
		this.win = Critter.Attack.FORFEIT;
		this.lose1 = Critter.Attack.FORFEIT;
		this.lose2 = Critter.Attack.FORFEIT;
	}

	public Critter.Attack getWin() {
		return this.win;
	}

	public void setWin(Critter.Attack win) {
		this.win = win;
	}

	public Critter.Attack getLose1() {
		return this.lose1;
	}

	public void setLose1(Critter.Attack lose1) {
		this.lose1 = lose1;
	}

	public Critter.Attack getLose2() {
		return this.lose2;
	}

	public void setLose2(Critter.Attack lose2) {
		this.lose2 = lose2;
	}
	
}
