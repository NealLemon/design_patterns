package com.principle.interfaceisolation.wrong;

/**
 * @ClassName TxtHandler
 * @Description 处理txt文件的类
 * @Author Neal
 * @Date 2019/2/28 19:45
 * @Version 1.0
 */
public class TxtHandler implements IFileHandler {

    public void readFile() {
        System.out.println("读取txt文件");
    }

    public void handlerData() {
        System.out.println("格式化数据");
    }

    public void database() {
        //不做任何操作
    }

    public void export() {
        System.out.println("导出excel");
    }
}
