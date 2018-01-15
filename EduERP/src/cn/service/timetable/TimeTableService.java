package cn.service.timetable;

import java.util.List;

import cn.pojo.TimeTable;

public interface TimeTableService {
	public List<TimeTable> findAll();//查询程表的所有信息
	public List<TimeTable> findAll(TimeTable timeTable);//查询程表的所有信息
    public int addTimeTable(TimeTable timeTable);//添加课表信息
    public int updateTimeTable(TimeTable timeTable);//修改课表信息
    public int deleteTimeTable(TimeTable timeTable);//删除课表信息
}
