package cn.service.classInfo;
/*
 * 刘森奇2018.1.17
 */
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.pojo.ClassInfo;
import cn.dao.classInfo.ClassInfoMapper;
@Service
public class ClassInfoServiceImpl implements ClassInfoService {
	@Resource
	public ClassInfoMapper classInfoMapper;
	@Override
	public List<ClassInfo> findBy(ClassInfo classInfo) {
		// TODO Auto-generated method stub
		return classInfoMapper.getClassInfoList(classInfo);
	}

	@Override
	public int addcla(ClassInfo classInfo) {
		// TODO Auto-generated method stub
		return classInfoMapper.addcla(classInfo);
	}

	@Override
	public int updatecla(ClassInfo classInfo) {
		// TODO Auto-generated method stub
		return classInfoMapper.addcla(classInfo);
	}

	@Override
	public int deletecla(ClassInfo classInfo) {
		// TODO Auto-generated method stub
		return classInfoMapper.deletecla(classInfo);
	}

}
