package cn.servicetimetable;

import java.util.List;

import cn.pojo.TimeTable;

public interface TimeTableService {
    public List<TimeTable> findAll();
}
