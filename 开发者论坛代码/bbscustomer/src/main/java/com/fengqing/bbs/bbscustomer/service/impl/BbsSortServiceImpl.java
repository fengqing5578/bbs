package com.fengqing.bbs.bbscustomer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fengqing.bbs.bbscustomer.service.BbsSortService;
import com.fengqing.bbs.bean.BbsSort;
import com.fengqing.bbs.service.RpcBbsSortService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("bbsSortService")
public class BbsSortServiceImpl implements BbsSortService {

    @Reference
    private RpcBbsSortService rpcBbsSortService;

    @Override
    public List<BbsSort> listBbsSorts() {
        return this.rpcBbsSortService.listBbsSorts();
    }
}
