package com.design.behavioral.template;

/**
 * 抽象父类
 */
public abstract class FileDataHandler {

    protected final void handleData() {
        readData();
        proccessData();
        intoDataBase();
        if(needExport()) {
            exportData();
        }
    }

    /**
     * 读取数据
     */
    final void readData() {
        System.out.println("----读取数据----");
    }

    /**
     * 清洗数据
     */
    final void proccessData() {
        System.out.println("----清洗数据-----");
    }

    /**
     * 数据入库
     */
    final void intoDataBase() {
        System.out.println("----数据入库-----");
    }

    /**
     * 导出数据
     */
    final void exportData() {
        System.out.println("----导出数据-----");
    }

    /**
     * 是否导出数据
     * @return
     */
    protected boolean needExport() {
        return false;
    }

    /**
     * 获取数据源
     */
    protected abstract void openSource();
}
