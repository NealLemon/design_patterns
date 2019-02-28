package com.principle.interfaceisolation.right;


/**
 * @ClassName TxtHandler
 * @Description 处理CSV文件的类
 * @Author Neal
 * @Date 2019/2/28 19:45
 * @Version 1.0
 */
public class CsvHandler implements IFileHandler,IDataIntoDataBase {

    public void readFile() {
        System.out.println("读取csv文件");
    }

    public void handlerData() {
        System.out.println("清洗数据");
    }

    public void database() {
        System.out.println("数据入库");
    }
}
