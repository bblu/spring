package com.bblu.patrol.dao;

import com.bblu.patrol.entity.TowerStyle;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TowerStyleDAO extends BaseDAO<TowerStyle> {

    List<TowerStyle> getAll();

    TowerStyle getById(@Param("id") int id);


}
