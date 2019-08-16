package com.fengqing.bbs.bbsprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.fengqing.bbs.bbsprovider.mapper.BbsDetailMapper;
import com.fengqing.bbs.bean.BbsDetail;
import com.fengqing.bbs.bean.BbsSort;
import com.fengqing.bbs.service.RpcBbsDetailService;

import javax.annotation.Resource;
import java.util.List;

@Service(interfaceClass = com.fengqing.bbs.service.RpcBbsDetailService.class)
public class BbsDetailServiceImpl implements RpcBbsDetailService {

    @Resource
    private BbsDetailMapper bbsDetailMapper;

    @Override
    public List<BbsDetail> list() {
        System.out.println("list222");
        return this.bbsDetailMapper.list();
    }

    @Override
    public List<BbsDetail> listByBbsSortId(int bbsSortId) {
        return this.bbsDetailMapper.listByBbsSortId(bbsSortId);
    }

    @Override
    public void addBbsDetail(int bbsSortId, String title, String author, String detail) {
        BbsSort bbsSort = new BbsSort();
        bbsSort.setId(bbsSortId);
        BbsDetail bbsDetail = new BbsDetail(title, author, detail, bbsSort);
       this.bbsDetailMapper.addBbsDetail(bbsDetail);
    }
}
