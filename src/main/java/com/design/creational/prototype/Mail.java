package com.design.creational.prototype;


import java.util.Date;

public class Mail implements Cloneable{

    private String name;

    private String content;

    private String address;

    //默认当前时间
    private Date sendDate = new Date();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", address='" + address + '\'' +
                ", sendDate=" + sendDate +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mail cloneMail = (Mail) super.clone();
        //避免浅拷贝
        cloneMail.sendDate = (Date) cloneMail.sendDate.clone();
        return cloneMail;
    }
}
