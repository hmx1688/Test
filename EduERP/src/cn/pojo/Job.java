package cn.pojo;

public class Job {

	public Integer id; //ID
	public Integer jid; //作业类型
	public String chaNumber;  //章节序号
	public String jname; //作业名称
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public String getChaNumber() {
		return chaNumber;
	}
	public void setChaNumber(String chaNumber) {
		this.chaNumber = chaNumber;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
