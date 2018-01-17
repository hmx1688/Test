package cn.dao.flowDetail;

import java.util.List;

import cn.pojo.FlowDetail;

public interface FlowDetailMapper {
	public List<FlowDetail> findAll();
	public List<FlowDetail> findBy(FlowDetail flowDetail);
	public int update(FlowDetail flowDetail);
	public int delete(FlowDetail flowDetail);
	public int insert(FlowDetail flowDetail);
}
