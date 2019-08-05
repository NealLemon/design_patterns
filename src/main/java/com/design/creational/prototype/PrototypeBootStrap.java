package com.design.creational.prototype;




public class PrototypeBootStrap {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        Mail mail = new Mail();
        mail.setName("钢铁侠");
        mail.setContent("我是你的粉丝");
        mail.setAddress("复仇者联盟");
        Mail cloneMail = (Mail) mail.clone();
        MailUtil.sendMail(mail);
        MailUtil.sendMail(cloneMail);
        //穿越一下
        mail.getSendDate().setTime(99999999999L);
        MailUtil.sendMail(mail);
        MailUtil.sendMail(cloneMail);
    }
}
