package cn.service.standarddetail;

import java.util.List;

import cn.pojo.StandardDetail;

public interface StandardDetailService {
	public List<StandardDetail> findAll();//查询标准课程详情表的所有信息
	public List<StandardDetail> findAll(StandardDetail standardDetail);//查询标准课程详情表的所有信息
    public int addStandardDetail(StandardDetail standardDetail);//添加标准课程详情表信息
    public int updateStandardDetail(StandardDetail standardDetail);//修改标准课程详情表信息
    public int deleteStandardDetail(StandardDetail standardDetail);//删除标准课程详情表信息
}
