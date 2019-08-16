package com.fengqing.bbs.bbscustomer.controller;

import com.alibaba.fastjson.JSONArray;
import com.fengqing.bbs.bbscustomer.service.BbsSortService;
import com.fengqing.bbs.bean.BbsSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bbsSort")
public class BbsSortController {

    @Autowired
    private BbsSortService bbsSortService;

    @RequestMapping("/listBbsSorts")
    public String listBbsSorts(){
        List<BbsSort> bbsSorts = this.bbsSortService.listBbsSorts();
        String json = JSONArray.toJSONString(bbsSorts);
        System.out.println(json);
        return json;
    }
}
