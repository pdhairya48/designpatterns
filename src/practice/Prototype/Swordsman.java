package practice.Prototype;

public class Swordsman extends GameUnit {

	private String state = "idle";

	public void attack() {
		this.state = "attacking";
	}

	@Override public String toString() {
		super.toString();
		final StringBuilder sb = new StringBuilder("Swordsman{");
		sb.append("state='").append(state).append('\'');
		sb.append('}');
		return sb.toString();
	}

	@Override
	protected void reset() {
		state = "idle";
	}

	
}
