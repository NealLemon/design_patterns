package com.design.behavioral.template;

/**
 * Json文件处理类
 */
public class JsonDataHandler extends FileDataHandler {
    @Override
    protected void openSource() {
        System.out.println("打开json文件");
    }

    /**
     * 激活钩子方法 导出
     * @return
     */
    @Override
    protected boolean needExport() {
        return true;
    }
}
