package com.design.structural.decorator;

/**
 * 女神的装饰抽象方法
 */
public abstract class AbstractGirlDecorate extends AbstractGirl {

    //将装饰类和装饰者关联
    private AbstractGirl abstractGirl;

    //通过构造函数关联
    public AbstractGirlDecorate(AbstractGirl abstractGirl) {
        this.abstractGirl = abstractGirl;
    }


    @Override
    protected String feature() {
        return this.abstractGirl.feature();
    }

    /**
     * 其他描述，对自己的标准
     */
    protected abstract void otherThings();

    @Override
    protected String getDesc() {
        return this.abstractGirl.getDesc();
    }
}
