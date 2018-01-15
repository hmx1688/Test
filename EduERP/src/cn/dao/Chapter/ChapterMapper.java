package cn.dao.Chapter;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.pojo.Chapter;

public interface ChapterMapper {

	/*
	 *查询章节
	 */
	public List<Chapter> getChapterList(Chapter chapter);
	/*
	 * 添加章节
	 */
	public int addcha(Chapter chapter);
	/*
	 * 修改章节
	 */
	public int updatecha(Chapter chapter);
	/*
	 * 删除章节
	 */
	public int deletecha(Chapter chapter);
}
