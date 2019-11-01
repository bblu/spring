package com.bblu.patrol.service;

import com.bblu.patrol.dao.LineDAO;
import com.bblu.patrol.dao.TowerDAO;
import com.bblu.patrol.entity.Line;
import com.bblu.patrol.entity.Tower;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class LineService {
    @Resource
    private LineDAO lineDao;
    @Resource
    private TowerDAO towerDao;

    public Line getSingle(int id){
           return lineDao.getById(id);
    }


    public List<Line> getLine(){
        return lineDao.getAll();
    }

    public List<Tower> getTower(int line){
        return towerDao.getByLine(line);
    }


}
