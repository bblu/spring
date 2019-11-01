package com.bblu.patrol.dao;

import com.bblu.patrol.entity.Line;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LineDAO extends BaseDAO<Line> {

    List<Line> getAll();

    Line getById(@Param("id") int id);
}
