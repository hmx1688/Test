package cn.service.classInfo;
/*
 * 刘森奇2018.1.17
 */
import java.util.List;

import cn.pojo.ClassInfo;

public interface ClassInfoService {
	
	public List<ClassInfo> findBy(ClassInfo classInfo);//查询
	
	public int addcla(ClassInfo classInfo);//添加
	
	public int updatecla(ClassInfo classInfo);//修改
	
	public int deletecla(ClassInfo classInfo);//删除
}
