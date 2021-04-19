package com.board.backend.test.vo;

import java.util.Date;

public class TestVo {
    private int no;
    private String title;
    private String content;
    private String writer;
    private Date regist_dt;

    public String getWriter() {
        return this.writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
    public int getNo() {
        return this.no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRegist_dt() {
        return this.regist_dt;
    }

    public void setRegist_dt(Date regist_dt) {
        this.regist_dt = regist_dt;
    }

}
