package cn.service.standard;

import java.util.List;

import cn.pojo.Standard;

public interface StandardService {
	public List<Standard> findAll();//查询标准课程表的所有信息
    public List<Standard> findAll(Standard standard);//查询标准课程表的所有信息
    public int addStandard(Standard standard);//添加标准课程表信息
    public int updateStandard(Standard standard);//修改标准课程表信息
    public int deleteStandard(Standard standard);//删除标准课程表信息
}
