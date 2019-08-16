package com.fengqing.bbs.bbsprovider.mapper;

import com.fengqing.bbs.bean.BbsDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BbsDetailMapper {

    //获取所有的贴子
    public List<BbsDetail> list();

    //获取指定分类的帖子
    public List<BbsDetail> listByBbsSortId(@Param("bbsSortId") int bbsSortId);

    public void addBbsDetail(BbsDetail bbsDetail);
}
