package cn.service.homework;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.homework.HomeWorkDao;
import cn.pojo.HomeWork;
@Service
public class HomeWorkServiceImpl implements HomeWorkService{
	@Resource
	private HomeWorkDao homeWorkDao;
	@Override
	public List<HomeWork> cx(HomeWork homeWork) {
		return homeWorkDao.findBy(homeWork);
	}

}
