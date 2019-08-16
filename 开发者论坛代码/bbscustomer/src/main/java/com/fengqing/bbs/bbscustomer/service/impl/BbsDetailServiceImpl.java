package com.fengqing.bbs.bbscustomer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fengqing.bbs.bbscustomer.service.BbsDetailService;
import com.fengqing.bbs.bean.BbsDetail;
import com.fengqing.bbs.service.RpcBbsDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bbsDetailService")
public class BbsDetailServiceImpl implements BbsDetailService {

    @Reference
    private RpcBbsDetailService rpcBbsDetailService;

    @Override
    public List<BbsDetail> list() {
        return this.rpcBbsDetailService.list();
    }

    @Override
    public List<BbsDetail> listByBbsSortId(int bbsSortId) {
        return this.rpcBbsDetailService.listByBbsSortId(bbsSortId);
    }

    @Override
    public void addBbsDetail(int bbsSortId, String title, String author, String detail) {
        this.rpcBbsDetailService.addBbsDetail(bbsSortId, title, author, detail);
    }

}
