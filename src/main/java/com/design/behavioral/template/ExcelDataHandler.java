package com.design.behavioral.template;

/**
 * Excel文件处理类
 */
public class ExcelDataHandler extends FileDataHandler {
    @Override
    protected void openSource() {
        System.out.println("打开Excel文件");
    }
}
