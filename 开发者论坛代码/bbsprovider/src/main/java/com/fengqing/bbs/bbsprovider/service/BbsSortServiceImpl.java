package com.fengqing.bbs.bbsprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.fengqing.bbs.bbsprovider.mapper.BbsSortMapper;
import com.fengqing.bbs.bean.BbsSort;
import com.fengqing.bbs.service.RpcBbsSortService;

import javax.annotation.Resource;
import java.util.List;

@Service(interfaceClass = com.fengqing.bbs.service.RpcBbsSortService.class)
public class BbsSortServiceImpl implements RpcBbsSortService {

    @Resource
    private BbsSortMapper bbsSortMapper;

    @Override
    public List<BbsSort> listBbsSorts() {
        return this.bbsSortMapper.list();
    }
}
