import java.util.HashMap;

public class SingletonObject {

	private HashMap<String,CritterStats> stats;
	private static SingletonObject ref;

	private SingletonObject() {
		this.stats = new HashMap<String,CritterStats>();
	}

	public static SingletonObject getSingletonObject() {
		if (ref == null)
			// it's ok, we can call this constructor
			ref = new SingletonObject();
		return ref;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
		// that'll teach 'em
	}

	public void add(String s, CritterStats cs) {
		this.stats.put(s, cs);
	}

	public CritterStats getStats(String s) {
		return this.stats.get(s);
	}

	public CritterStats setStats(String s, CritterStats cs) {
		if (this.stats.containsKey(s)) {
			this.stats.get(s).setWin(cs.getWin());
			this.stats.get(s).setLose1(cs.getLose1());
			this.stats.get(s).setLose2(cs.getLose2());
			return this.stats.get(s);
		} else {
			return null;
		}
	}

	public CritterStats setStats(String s, Critter.Attack a1,
			Critter.Attack a2, Critter.Attack a3) {
		if (this.stats.containsKey(s)) {
			this.stats.get(s).setWin(a1);
			this.stats.get(s).setLose1(a2);
			this.stats.get(s).setLose2(a3);
			return this.stats.get(s);
		} else {
			return null;
		}
	}

}
