package com.fengqing.bbs.bean;

import java.io.Serializable;
import java.util.Date;

/*
详细内容类
 */
public class BbsDetail implements Serializable{
    private Integer id;

    private String title;

    private String detail;

    private String author;

    private Date createDate;

    private int replyCount;

    private BbsSort bbsSort;

    public BbsDetail(String title, String author, String detail, BbsSort bbsSort) {
        this.title = title;
        this.detail = detail;
        this.author = author;
        this.bbsSort = bbsSort;
    }

    public BbsDetail() {
    }

    public BbsSort getBbsSort() {
        return bbsSort;
    }

    public void setBbsSort(BbsSort bbsSort) {
        this.bbsSort = bbsSort;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }
}
