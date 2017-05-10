package model;

public class Logs {
	private boolean rollable;
	private String collor;
	private int tons;
	
	public Logs()
	{
		this.rollable = false;
		this.collor = "red";
		this.tons = 1000;
	}
	public Logs(boolean rollable, String collor, int tons)
	{
		this.rollable = rollable;
		this.collor = collor;
		this.tons = tons;
	}

	public boolean isRollable() {
		return rollable;
	}

	public void setRollable(boolean rollable) {
		this.rollable = rollable;
	}

	public String getCollor() {
		return collor;
	}

	public void setCollor(String collor) {
		this.collor = collor;
	}

	public int getTons() {
		return tons;
	}

	public void setTons(int tons) {
		this.tons = tons;
	}
}
