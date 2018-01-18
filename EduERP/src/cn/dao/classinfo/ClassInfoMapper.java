package cn.dao.classinfo;
/*
 * 刘森奇2018.1.18
 */
import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.pojo.ClassInfo;

public interface ClassInfoMapper {
	/**
	 * 增加班级信息
	 */
	public int addcla(ClassInfo classInfo);
	/**
	 * 查询班级信息
	 */
	public List<ClassInfo> getClassInfoList(ClassInfo classInfo);
	/**
	 * 删除班级信息
	 */
	public int deletecla(ClassInfo classInfo);
	/**
	 * 更改班级信息
	 */
	public int updatecla(ClassInfo classInfo);
}
