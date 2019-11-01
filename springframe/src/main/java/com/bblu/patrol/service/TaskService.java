package com.bblu.patrol.service;

import com.bblu.patrol.dao.TaskDAO;
import com.bblu.patrol.entity.Task;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class TaskService {
    @Resource
    private TaskDAO taskDao;

    public Task getSingle(int taskId){
           return taskDao.getById(taskId);
    }
    public List<Task> getTask(int offset,int limit){
        return taskDao.getTask(offset,limit);
    }

}
