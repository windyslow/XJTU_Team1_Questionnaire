package org.jiaoda.mtappsys_team01.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.jiaoda.mtappsys_team01.entity.Store;

import java.util.List;

/**
 * 商铺数据访问层
 */
@Mapper
public interface IStoreDao {
    //商铺列表查询
    @Select("select * from tab_store")
    List<Store> getStoreList();

}
