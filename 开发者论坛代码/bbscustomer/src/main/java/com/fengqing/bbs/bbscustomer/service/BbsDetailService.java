package com.fengqing.bbs.bbscustomer.service;

import com.fengqing.bbs.bean.BbsDetail;

import java.util.List;

public interface BbsDetailService {
    //获取所有的贴子
    public List<BbsDetail> list();

    //获取指定分类的帖子
    public List<BbsDetail> listByBbsSortId(int bbsSortId);

    //添加帖子
    public void addBbsDetail(int bbsSortId, String title, String author, String detail);
}
