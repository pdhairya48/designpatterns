package practice.Prototype;

//Doesn't support cloning
public class General extends GameUnit{

	private String state = "idle";
	
	public void boostMorale() {
		this.state = "MoralBoost";
	}

	@Override public String toString() {
		final StringBuilder sb = new StringBuilder("General{");
		sb.append("state='").append(state).append('\'');
		sb.append('}');
		return sb.toString();
	}

	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Ganerals are unique");
	}

	@Override
	protected void reset() {
		throw new UnsupportedOperationException("Reset not supported");
	}
	
}
