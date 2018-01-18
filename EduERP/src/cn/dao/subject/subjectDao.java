package cn.dao.subject;

import java.util.List;

import javax.security.auth.Subject;

public interface subjectDao {
	public int update(Subject subject);
	public int delete(Subject subject);
	public int insert(Subject subject);
	public List<Subject> findAll();
	public List<Subject> findBy(Subject subject);
}
