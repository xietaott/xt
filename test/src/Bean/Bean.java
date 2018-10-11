package Bean;

public class Bean {
	private String staName;
	private String stasex;
	private String staEnroDate;
	public String getStaName() {
		return staName;
	}
	public void setStaName(String staName) {
		this.staName = staName;
	}
	public String getStasex() {
		return stasex;
	}
	public void setStasex(String stasex) {
		this.stasex = stasex;
	}
	public String getStaEnroDate() {
		return staEnroDate;
	}
	public void setStaEnroDate(String staEnroDate) {
		this.staEnroDate = staEnroDate;
	}
	public Bean(String staName, String stasex, String staEnroDate) {
		super();
		this.staName = staName;
		this.stasex = stasex;
		this.staEnroDate = staEnroDate;
	}
}
