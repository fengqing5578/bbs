package com.fengqing.bbs.bbscustomer.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fengqing.bbs.bbscustomer.service.BbsDetailService;
import com.fengqing.bbs.bean.BbsDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/bbsDetail")
public class BbsDetailController {

    @Autowired
    private BbsDetailService bbsDetailService;

    @RequestMapping("/listBbsDetails")
    public String listBbsDetails(){
        List<BbsDetail> bbsDetails = this.bbsDetailService.list();
        String json = JSONArray.toJSONString(bbsDetails);
        System.out.println(json);
        return json;
    }

    @RequestMapping("/listBbsDetailsByBbsSortId")
    public String listBbsDetailsByBbsSortId(int bbsSortId){
        List<BbsDetail> bbsDetails = this.bbsDetailService.listByBbsSortId(bbsSortId);
        String json = JSONArray.toJSONString(bbsDetails);
        System.out.println(json);
        return json;
    }

    @RequestMapping("/addBbsDetail")
    public String addBbsDetail(int bbsSortId, String title, String author, String detail) {
        this.bbsDetailService.addBbsDetail(bbsSortId, title, author, detail);
        Map<String, String> map = new HashMap<String, String>();
        map.put("msg", "success");
        return JSONObject.toJSONString(map);
    }
}
