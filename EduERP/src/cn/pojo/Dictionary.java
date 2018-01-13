package cn.pojo;

public class Dictionary {
	//参数表属性
	private String dictCode;	//类型ID
	private String diname;		//类型名称
	private String parentid;		//类型父ID
	private String sortIndex;		//排序
	private String remark;		//备注
	public String getDictCode() {
		return dictCode;
	}
	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}
	public String getDiname() {
		return diname;
	}
	public void setDiname(String diname) {
		this.diname = diname;
	}
	
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	public String getSortIndex() {
		return sortIndex;
	}
	public void setSortIndex(String sortIndex) {
		this.sortIndex = sortIndex;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
