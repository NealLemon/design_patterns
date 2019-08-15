package com.design.behavioral.template;

public class TemplateBootstrap {

    public static void main(String[] args) {
        FileDataHandler excel = new ExcelDataHandler();
        excel.openSource();
        excel.handleData();
        System.out.println("----------------------------------");
        FileDataHandler json = new JsonDataHandler();
        json.openSource();
        json.handleData();

    }
}
