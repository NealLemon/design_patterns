package com.principle.interfaceisolation.wrong;

/**
 * @ClassName TxtHandler
 * @Description 处理CSV文件的类
 * @Author Neal
 * @Date 2019/2/28 19:45
 * @Version 1.0
 */
public class CsvHandler implements IFileHandler {

    public void readFile() {
        System.out.println("读取csv文件");
    }

    public void handlerData() {
        System.out.println("清洗数据");
    }

    public void database() {

        System.out.println("数据导入数据库");
    }

    public void export() {
        //不做任何操作

    }
}
