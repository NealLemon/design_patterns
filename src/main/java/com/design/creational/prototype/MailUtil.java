package com.design.creational.prototype;

import java.text.MessageFormat;

public class MailUtil {

    private static String CONTENT = "向{0}，邮件地址:{1},发送内容: {2},发送时间:{3},发送成功!";
    public  static void sendMail(Mail mail) {
        System.out.println(MessageFormat.format(CONTENT,mail.getName(),mail.getAddress(),mail.getContent(),mail.getSendDate()));
    }
}
