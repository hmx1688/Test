package cn.service.chapter;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.chapter.ChapterMapper;
import cn.pojo.Chapter;
@Service
public class ChapterServiceImpl implements ChapterService {

	@Resource
	public ChapterMapper chapterMapper;
	@Override
	public List<Chapter> findBy(Chapter chapter) {
		
		return chapterMapper.getChapterList(chapter);
	}

	@Override
	public int addcha(Chapter chapter) {
		// TODO Auto-generated method stub
		return chapterMapper.addcha(chapter);
	}

	@Override
	public int updatecha(Chapter chapter) {
		// TODO Auto-generated method stub
		return chapterMapper.updatecha(chapter);
	}

	@Override
	public int deletecha(Chapter chapter) {
		// TODO Auto-generated method stub
		return chapterMapper.deletecha(chapter);
	}

}
