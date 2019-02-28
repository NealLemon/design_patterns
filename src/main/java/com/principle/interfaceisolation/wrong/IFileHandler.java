package com.principle.interfaceisolation.wrong;

/**
 * @InterfaceName IFileHandler
 * @Description 文件处理接口
 * @Author Neal
 * @Date 2019/2/28 19:41
 * @Version 1.0
 */
public interface IFileHandler {
    /**
     * 读取文件
     */
    void readFile();

    /**
     * 处理数据
     */
    void handlerData();

    /**
     * 入库
     */
    void database();

    /**
     * 导出
     */
    void export();
}
