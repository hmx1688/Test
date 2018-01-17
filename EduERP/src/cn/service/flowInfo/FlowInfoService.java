package cn.service.flowInfo;

import java.util.List;

import cn.pojo.FlowInfo;

public interface FlowInfoService {
	public List<FlowInfo> findAll();
	public List<FlowInfo> findBy(FlowInfo flowinfo);
	public int update(FlowInfo flowinfo);
	public int delete(FlowInfo flowinfo);
	public int insert(FlowInfo flowinfo);
}
