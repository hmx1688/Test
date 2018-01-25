package cn.service.classinfo;

import java.util.List;

import cn.pojo.ClassInfo;

public interface ClassInfoService {
	
    public List<ClassInfo> findBy(ClassInfo classinfo);//查询
	
	public int insert(ClassInfo classinfo);//添加
	
	public int update(ClassInfo classinfo);//修改
	
	public int delete(ClassInfo classinfo);//删除
}
