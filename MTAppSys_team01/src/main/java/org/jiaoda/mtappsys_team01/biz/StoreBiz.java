package org.jiaoda.mtappsys_team01.biz;

import org.jiaoda.mtappsys_team01.dao.IStoreDao;
import org.jiaoda.mtappsys_team01.entity.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreBiz {

     //注入数据访问层对象
     @Autowired
     private IStoreDao storeDao;

     //商铺列表查询方法
     public List<Store> getStoreList(){
          //调用数据访问层中的商铺列表方法
          List<Store> storeList = storeDao.getStoreList();
          return storeList;
     }
}
