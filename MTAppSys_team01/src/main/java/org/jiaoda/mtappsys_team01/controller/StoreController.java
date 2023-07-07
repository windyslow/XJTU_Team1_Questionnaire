package org.jiaoda.mtappsys_team01.controller;

import org.jiaoda.mtappsys_team01.biz.StoreBiz;
import org.jiaoda.mtappsys_team01.entity.Store;
import org.jiaoda.mtappsys_team01.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/store")
public class StoreController {
    //注入业务逻辑层
    @Autowired
    private StoreBiz storeBiz;

    //商铺查询方法
    @GetMapping("/getStoreList")
    @ResponseBody
    public JSONResult getStoreList(HttpServletResponse response){
        System.out.println("店铺列表信息已加载");
        //跨域问题
        response.setHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Access-Control-Allow-Methods","POST,GET");
        //调用业务逻辑层的商铺列表方法
        List<Store> storeList = storeBiz.getStoreList();
        return JSONResult.ok(storeList);
    }
}
