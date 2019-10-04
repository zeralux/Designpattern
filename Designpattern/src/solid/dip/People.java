package solid.dip;

public class People {
	private Stuffer stuffer;
	
	public People() {
	}
	
	public Stuffer getStuffer() {
		return stuffer;
	}

	public void setStuffer(Stuffer stuffer) {
		this.stuffer = stuffer;
	}

	public void eat() {
		// 填飽肚子
		stuffer.stuff();
	}
}
