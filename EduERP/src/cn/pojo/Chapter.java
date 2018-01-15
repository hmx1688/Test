package cn.pojo;

public class Chapter {

	public int id; //ID
	public int chaId; //章节编码
	public String chaName; //章节名称
	public String chaNumber; //章节序号
	public int getChaId() {
		return chaId;
	}
	public void setChaId(int chaId) {
		this.chaId = chaId;
	}
	public String getChaName() {
		return chaName;
	}
	public void setChaName(String chaName) {
		this.chaName = chaName;
	}
	public String getChaNumber() {
		return chaNumber;
	}
	public void setChaNumber(String chaNumber) {
		this.chaNumber = chaNumber;
	}
}
