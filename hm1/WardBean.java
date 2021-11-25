package hm1;

import java.io.Serializable;

public class WardBean implements Serializable {
	
	private String warD;
	public String getWarD() {
		return warD;
	}
	public void setWarD(String warD) {
		this.warD = warD;
	}
	public String getRooM() {
		return rooM;
	}
	public void setRooM(String rooM) {
		this.rooM = rooM;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	private String rooM;
	private String iD;

}
